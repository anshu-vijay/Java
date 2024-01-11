package com.sample.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sample.entity.StudentAssignment;

@Repository
public interface StudentAssignmentDao extends JpaRepository<StudentAssignment, Serializable> {

	@Query("SELECT sa FROM StudentAssignment sa INNER JOIN sa.assignment a")
	List<StudentAssignment> getStudentAssignmentList();

	@Query(nativeQuery = true, value = "SELECT T1 .* FROM (SELECT S_ID,A_ID FROM STUDENT_ASSIGNMENT  EXCEPT SELECT S_ID,A_ID FROM STUDENT_ASSIGNMENT_SUBMISSION ) AS T1")
	List<StudentAssignment> findAssignmentPendingWithStudent();
}
