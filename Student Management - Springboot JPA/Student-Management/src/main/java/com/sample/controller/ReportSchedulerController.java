package com.sample.controller;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import com.sample.dao.StudentAssignmentDao;
import com.sample.entity.Assignment;
import com.sample.entity.Student;
import com.sample.entity.StudentAssignment;
import com.sample.entity.StudentAssignmentReport;
import com.sample.entity.StudentAssignmentSubmission;
import com.sample.services.ManageAssignmentService;
import com.sample.services.StudentAssignmentReportService;
import com.sample.services.StudentAssignmentSubmissionService;

@RestController
public class ReportSchedulerController {
	@Autowired
	StudentAssignmentDao studentAssignmentDao;
	@Autowired
	ManageAssignmentService manageAssignmentService;

	@Autowired
	StudentAssignmentSubmissionService studentAssignmentSubmissionService;

	@Autowired
	StudentAssignmentReportService studentAssignmentReportService;

	@Scheduled(fixedDelay = 10000)
//	@Scheduled(cron = "0 0 */1 * * *")
	public void addReport() {
		List<StudentAssignment> pendingStudentAssignments = studentAssignmentDao.findAssignmentPendingWithStudent();

		List<StudentAssignmentSubmission> studentAssignmentSubmitted = studentAssignmentSubmissionService
				.findAllSubmission();

		for (StudentAssignmentSubmission submittedSA : studentAssignmentSubmitted) {
			Student student = submittedSA.getStudent();
			Assignment assignment = submittedSA.getAssignment();
			if(studentAssignmentReportService.checkReportExists(student.getsId(), assignment.getaId())) continue;
			StudentAssignmentReport report = new StudentAssignmentReport();
			report.setStudent(student);

			LocalDateTime assignmentStartDate = submittedSA.getAssignment().getAssignmentStartDate();
			report.setAssignment(assignment);
			ZoneOffset zone = ZoneOffset.of("Z");
			long scoreValue = submittedSA.getFileSize() +  (submittedSA.getSubmissionDate().toEpochSecond(zone) - assignmentStartDate.toEpochSecond(zone))* 1000;
			String score = String.valueOf(scoreValue);
			report.setScore(score.substring(0,4));
			
			System.out.println(score);
			studentAssignmentReportService.saveOrUpdate(report);
		}

		for (StudentAssignment pendingStudentAssignment : pendingStudentAssignments) {

			System.out.println(pendingStudentAssignment.getStudent().getFirstName() + " "
					+ pendingStudentAssignment.getAssignment().getAssignmentName());
		}
	}

}