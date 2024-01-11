package com.sample.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.ManageDepartmentDao;
import com.sample.entity.Department;

import jakarta.transaction.Transactional;

@Service
public class ManageDepartmentService {
	@Autowired
	private ManageDepartmentDao manageDepartmentDao;

	@Transactional
	public List<Department> getAllDepartment() {
		List<Department> departments = new ArrayList<Department>();
		manageDepartmentDao.findAll().forEach(dpt -> departments.add(dpt));
		return departments;
	}

	@Transactional
	public Department getDepartmentById(Long did) {
		return manageDepartmentDao.findById(did).get();
	}

	@Transactional
	public Department saveOrUpdate(Department department) {
		return manageDepartmentDao.save(department);
	}
	

}
