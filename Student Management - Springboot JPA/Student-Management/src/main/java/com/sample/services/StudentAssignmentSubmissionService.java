package com.sample.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.StudentAssignmentSubmissionDao;
import com.sample.entity.Student;
import com.sample.entity.StudentAssignmentReport;
import com.sample.entity.StudentAssignmentSubmission;

import jakarta.transaction.Transactional;

@Service
public class StudentAssignmentSubmissionService {
	@Autowired
	StudentAssignmentSubmissionDao studentAssignmentSubmissionDao;

	@Transactional
	public StudentAssignmentSubmission saveOrUpdate(StudentAssignmentSubmission studentAssignmentSubmission) {
		return studentAssignmentSubmissionDao.save(studentAssignmentSubmission);
	}

	@Transactional
	public List<StudentAssignmentSubmission> findAllSubmission() {
		List<StudentAssignmentSubmission> submissions = new ArrayList<StudentAssignmentSubmission>();
		studentAssignmentSubmissionDao.findAll().forEach(submission -> submissions.add(submission));
		return submissions;

	}

	@Transactional
	public boolean checkAssignmentSubmissionExists(Long s_id, Long a_id) {
		boolean flag = false;
		Iterable<StudentAssignmentSubmission> studentAssignmentSubmissions = studentAssignmentSubmissionDao.findAll();
		for (StudentAssignmentSubmission studentAssignmentSubmission : studentAssignmentSubmissions) {

			if (studentAssignmentSubmission.getAssignment().getaId() == a_id
					&& studentAssignmentSubmission.getStudent().getsId() == s_id) {
				flag = true;
				break;
			}
		}
		return flag;
	}
}
