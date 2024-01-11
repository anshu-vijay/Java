package com.sample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.StudentAssignmentDao;
import com.sample.entity.StudentAssignment;

import jakarta.transaction.Transactional;

@Service
public class StudentAssignmentService {
	
	@Autowired
	StudentAssignmentDao studentAssignmentDao;
	
	
	@Transactional
	public StudentAssignment saveOrUpdate(StudentAssignment studentAssignment) {
		return studentAssignmentDao.save(studentAssignment);
	}

}
