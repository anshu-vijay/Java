package com.sample.springbootmongodb.service;

import com.sample.springbootmongodb.collection.StudentAssignmentSubmission;
import com.sample.springbootmongodb.repository.StudentAssignmentSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class StudentAssignmentSubmissionService {
    @Autowired
    StudentAssignmentSubmissionRepository studentAssignmentSubmissionRepository;

    @Transactional
    public StudentAssignmentSubmission saveOrUpdate(StudentAssignmentSubmission studentAssignmentSubmission) {
        return studentAssignmentSubmissionRepository.save(studentAssignmentSubmission);
    }

    @Transactional
    public List<StudentAssignmentSubmission> findAllSubmission() {
        List<StudentAssignmentSubmission> submissions = new ArrayList<StudentAssignmentSubmission>();
        studentAssignmentSubmissionRepository.findAll().forEach(submission -> submissions.add(submission));
        return submissions;

    }
    @Transactional
    public boolean checkAssignmentSubmissionExists(String firstname, String assignmentname) {
        boolean flag = false;
        Iterable<StudentAssignmentSubmission> studentAssignmentSubmissions = studentAssignmentSubmissionRepository.findAll();
        for (StudentAssignmentSubmission studentAssignmentSubmission : studentAssignmentSubmissions) {

            if (Objects.equals(studentAssignmentSubmission.getAssignment().getAssignmentName(), assignmentname)
                    && Objects.equals(studentAssignmentSubmission.getStudent().getFirstName(), firstname)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
