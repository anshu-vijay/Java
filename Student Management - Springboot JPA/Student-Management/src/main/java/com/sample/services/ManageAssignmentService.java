package com.sample.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.ManageAssignmentDao;
import com.sample.dao.StudentAssignmentDao;
import com.sample.entity.Assignment;

import jakarta.transaction.Transactional;

@Service
public class ManageAssignmentService {

	@Autowired
	private ManageAssignmentDao manageAssignmentDao;

	@Autowired
	StudentAssignmentDao studentAssignmentDao;

	@Transactional
	public List<Assignment> getAllAssignment() {
		List<Assignment> assignments = new ArrayList<Assignment>();
		manageAssignmentDao.findAll().forEach(assignments1 -> assignments.add(assignments1));
		return assignments;
	}

	@Transactional
	public Assignment getAssignmentById(Long aid) {
		return manageAssignmentDao.findById(aid).get();
	}

	@Transactional
	public Assignment saveOrUpdate(Assignment assignments) {
		return manageAssignmentDao.save(assignments);
	}

}
