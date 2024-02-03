package com.sample.springbootmongodb.repository;

import com.sample.springbootmongodb.collection.Assignment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface ManageAssignmentRepository extends MongoRepository<Assignment, Serializable> {
    Assignment findByAssignmentName(String assignmentname);

    @Query(value = "{assignmentName : ?0}", fields = "{assignmentStartDate : 1, assignmentEndDate : 1}")
    Assignment getStartEndDateByAssignmentName(String assignmentname);

}
