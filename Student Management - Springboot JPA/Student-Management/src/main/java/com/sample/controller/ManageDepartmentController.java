package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.commons.Status;
import com.sample.entity.Department;
import com.sample.entity.Student;
import com.sample.services.ManageDepartmentService;

@RestController
@RequestMapping("/department")
public class ManageDepartmentController {
	@Autowired
	ManageDepartmentService manageDepartmentService;

	// Retrieves all the departments details
	@GetMapping("/all")
	private List<Department> getAllDepartment() {
		return manageDepartmentService.getAllDepartment();
	}

	// Retrieves the detail of a specific department
	@GetMapping("/{departmentid}")
	private Department getDepartment(@PathVariable("departmentid") Long departmentid) {
		return manageDepartmentService.getDepartmentById(departmentid);
	}

	// Add the department detail in the database
	@PostMapping("/add")
	private Department saveDepartment(@RequestBody Department departments) {
		return manageDepartmentService.saveOrUpdate(departments);
	}

	// Updates the department detail
	@PutMapping("/update")
	private Department update(@RequestBody Department departments) {
		manageDepartmentService.saveOrUpdate(departments);
		return departments;
	}

	// Add the department detail in the database
	@GetMapping("/deactivate/{departmentid}")
	private Department deactivateDepartment(@PathVariable("departmentid") Long departmentid) {
		Department department = manageDepartmentService.getDepartmentById(departmentid);
		department.setActiveFlag(Status.N);
		return manageDepartmentService.saveOrUpdate(department);
	}
	
	@GetMapping("/students/{departmentid}")
	private List<Student> getStudentsByDepartmentId(@PathVariable("departmentid") Long departmentid){
		Department department = manageDepartmentService.getDepartmentById(departmentid);
		List<Student> students = department.getStudents();
		return students;
	}

}
