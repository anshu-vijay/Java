package com.sample.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.entity.Student;

@Repository
public interface ManageStudentDao extends CrudRepository<Student, Long>{

}
