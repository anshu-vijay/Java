package com.sample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.StudentAssignmentReportDao;
import com.sample.entity.StudentAssignmentReport;

import jakarta.transaction.Transactional;

@Service
public class StudentAssignmentReportService {

	@Autowired
	StudentAssignmentReportDao studentAssignmentReportDao;

	@Transactional
	public StudentAssignmentReport saveOrUpdate(StudentAssignmentReport studentAssignmentReport) {
		return studentAssignmentReportDao.save(studentAssignmentReport);
	}

	@Transactional
	public boolean checkReportExists(Long s_id, Long a_id) {
		boolean flag = false;
		Iterable<StudentAssignmentReport> studentAssignmentReports = studentAssignmentReportDao.findAll();
		for (StudentAssignmentReport report : studentAssignmentReports) {

			if (report.getAssignment().getaId() == a_id && report.getStudent().getsId() == s_id) {
				flag = true;
				break;
			}
		}
		return flag;
	}
}
