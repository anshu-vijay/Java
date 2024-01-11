package com.sample.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.entity.StudentAssignmentSubmission;

@Repository
public interface StudentAssignmentSubmissionDao extends CrudRepository<StudentAssignmentSubmission, Long>{

}
