package com.sample.springbootmongodb.repository;

import com.sample.springbootmongodb.collection.Assignment;
import com.sample.springbootmongodb.collection.StudentAssignment;
import com.sample.springbootmongodb.collection.StudentAssignmentSubmission;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;


@Repository
public interface StudentAssignmentSubmissionRepository extends MongoRepository<StudentAssignmentSubmission, Serializable> {

}
