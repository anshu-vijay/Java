package com.sample.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.dao.StudentAssignmentDao;
import com.sample.entity.Assignment;
import com.sample.entity.Student;
import com.sample.entity.StudentAssignment;
import com.sample.services.ManageAssignmentService;
import com.sample.services.ManageStudentService;
import com.sample.services.StudentAssignmentService;

@RestController
@RequestMapping("/student-assignment")
public class StudentAssignmentController {

	@Autowired
	StudentAssignmentDao studentAssignmentDao;
	
	@Autowired
	ManageStudentService manageStudentService;
	
	@Autowired
	StudentAssignmentService studentAssignmentService;
	
	@Autowired
	ManageAssignmentService manageAssignmentService;

	@GetMapping("/")
	List<StudentAssignment> getStudentAssignmentList() {
		return studentAssignmentDao.getStudentAssignmentList();
	}

	@GetMapping("/pending")
	List<StudentAssignment> findAssignmentPendingWithStudent() {
		return studentAssignmentDao.findAssignmentPendingWithStudent();
	}
	
	@GetMapping("/assign")
	private StudentAssignment asignmentToStudent(Long s_id, Long a_id) {
		StudentAssignment assign = new StudentAssignment();
//		LocalDateTime dt_now = LocalDateTime.now();
//		Map<String, Object> map = new HashMap<>();

		Assignment assignment = manageAssignmentService.getAssignmentById(a_id);

//			if (assignment.getAssignmentEndDate().isBefore(dt_now)) {
//				throw new Exception("Assignment end date should not be lesser than current date.");
//			}
			Student student = manageStudentService.getStudentById(s_id);
			assign.setStudent(student);

			assign.setAssignment(assignment);
			return studentAssignmentService.saveOrUpdate(assign);

	}
}
