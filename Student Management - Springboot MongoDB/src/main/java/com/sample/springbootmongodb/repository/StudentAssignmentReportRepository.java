package com.sample.springbootmongodb.repository;

import com.sample.springbootmongodb.collection.StudentAssignmentReport;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface StudentAssignmentReportRepository extends MongoRepository<StudentAssignmentReport, Serializable>{
}
