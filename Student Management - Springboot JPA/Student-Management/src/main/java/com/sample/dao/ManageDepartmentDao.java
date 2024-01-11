package com.sample.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.entity.Department;
@Repository
public interface ManageDepartmentDao extends CrudRepository<Department, Long> {

	Department findByDepartmentName(String string);
	
	
}
