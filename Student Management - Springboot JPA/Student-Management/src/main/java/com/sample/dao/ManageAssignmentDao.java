package com.sample.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.entity.Assignment;
import com.sample.entity.Student;
import com.sample.entity.StudentAssignment;

@Repository
public interface ManageAssignmentDao extends CrudRepository<Assignment, Long> {

	Assignment findByAssignmentName(String string);

	List<StudentAssignment> findByStudents(Student student);
}
