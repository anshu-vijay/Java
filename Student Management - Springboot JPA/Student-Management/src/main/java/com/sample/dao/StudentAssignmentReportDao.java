package com.sample.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.entity.StudentAssignment;
import com.sample.entity.StudentAssignmentReport;

@Repository
public interface StudentAssignmentReportDao extends CrudRepository<StudentAssignmentReport, Long>{
}
