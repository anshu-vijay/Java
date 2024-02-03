package com.sample.springbootmongodb.repository;

import com.sample.springbootmongodb.collection.Student;
import com.sample.springbootmongodb.collection.StudentAssignment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface StudentAssignmentRepository extends MongoRepository<StudentAssignment, Serializable> {

    @Query(value="{ student : ?0}", fields="{ assignment : 1 }")
    List<StudentAssignment> findAllAssignmentsOfStudent(String studentId);

//    List<StudentAssignment> findAssignmentPendingWithStudent();
}
