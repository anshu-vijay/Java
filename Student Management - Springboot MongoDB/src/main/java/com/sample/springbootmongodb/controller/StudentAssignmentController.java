package com.sample.springbootmongodb.controller;

import com.sample.springbootmongodb.collection.Assignment;
import com.sample.springbootmongodb.collection.Student;
import com.sample.springbootmongodb.collection.StudentAssignment;
import com.sample.springbootmongodb.collection.StudentAssignmentSubmission;
import com.sample.springbootmongodb.repository.StudentAssignmentRepository;
import com.sample.springbootmongodb.service.ManageAssignmentService;
import com.sample.springbootmongodb.service.ManageStudentService;
import com.sample.springbootmongodb.service.StudentAssignmentService;
import com.sample.springbootmongodb.service.StudentAssignmentSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/student-assignment")
public class StudentAssignmentController {

    @Autowired
    StudentAssignmentRepository studentAssignmentRepository;

    @Autowired
    ManageStudentService manageStudentService;

    @Autowired
    StudentAssignmentService studentAssignmentService;

    @Autowired
    ManageAssignmentService manageAssignmentService;

    @Autowired
    StudentAssignmentSubmissionService studentAssignmentSubmissionService;

    @GetMapping("/")
    List<StudentAssignment> getStudentAssignmentList() {
        return studentAssignmentService.getStudentAssignmentList();
    }

    @GetMapping("/pending")
    List<StudentAssignment> findAssignmentPendingWithStudent() {
        return studentAssignmentService.findAssignmentPendingWithStudent();
    }

    @GetMapping("/assign")
    private Map<String, String> asignmentToStudent(String studentname, String assignmentname) throws Exception {
        Map<String, String> map = new HashMap<>();
        StudentAssignment assign = new StudentAssignment();

        Assignment assignment = manageAssignmentService.findByAssignmentName(assignmentname);
        Student student = manageStudentService.findByFirstName(studentname);

        String sId = student.getSId();
        if (studentAssignmentService.checkAlreadyAssigned(sId, assignment.getAId())) {
            map.put("message", "Assignment already assigned to student");
        } else {
            assign.setStudent(student);
            assign.setAssignment(assignment);
            studentAssignmentService.saveOrUpdate(assign);
            map.put("message", "Assignment assigned to student");
        }
        return map;
    }

    @PostMapping(value = "/submit", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Map<String, Object> handleFileUploadUsingCurl(@RequestPart MultipartFile file, String firstname, String assignmentname) {
        StudentAssignmentSubmission submission = new StudentAssignmentSubmission();
        Map<String, Object> map = new HashMap<>();
        try {
            if (studentAssignmentSubmissionService.checkAssignmentSubmissionExists(firstname, assignmentname))
                throw new Exception("Assignment is already submitted");
            boolean flag = false;
            Student submitter = manageStudentService.findByFirstName(firstname);

            List<StudentAssignment> assignments = studentAssignmentService.getAssignmentsOfStudent(submitter.getSId());
//            List<StudentAssignment> assignments = submitter.getAssignments();
            for (StudentAssignment assignment : assignments) {

                if (Objects.equals(assignmentname, assignment.getAssignment().getAssignmentName())) {
                    flag = true;
                }
            }
            if (!flag) throw new Exception("Assignment not assigned to student");
            String fileName = file.getOriginalFilename();
            assert fileName != null;
            if (!fileName.endsWith(".docx") || !file.getContentType().equalsIgnoreCase("application/vnd.openxmlformats-officedocument.wordprocessingml.document"))
                throw new Exception("File is not in .docx format");

            submission.setFileName(fileName);

            LocalDateTime dt_now = LocalDateTime.now();
            Assignment assignment = manageAssignmentService.findByAssignmentName(assignmentname);
            if (dt_now.isAfter(assignment.getAssignmentEndDate()))
                throw new Exception("Assignment submission end date elapsed");
            submission.setAssignment(assignment);

            submission.setStudent(submitter);

            submission.setSubmittedBy(submitter.getFirstName() + " " + submitter.getLastName());

            submission.setSubmissionDate(dt_now);

            Blob fileContent = new SerialBlob(file.getBytes());
            submission.setFile(fileContent);

            submission.setFileSize(file.getSize() / 1024);

            studentAssignmentSubmissionService.saveOrUpdate(submission);

            map.put("success", true);
            map.put("message", "Assignemnt submitted successfully");
        } catch (Exception e) {
            map.put("success", false);
            map.put("message", "Failed to submit assignment : " + e.getMessage());
        }
        return map;
    }

}
