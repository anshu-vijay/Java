package com.sample.springbootmongodb.repository;

import com.sample.springbootmongodb.collection.Department;
import com.sample.springbootmongodb.collection.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


@Repository
public interface ManageDepartmentRepository extends MongoRepository<Department, Serializable> {

    Department findByDepartmentName(String department);
    @Query(value="{ departmentName : ?0}", fields="{ hodName : 1 , departmentName :  1}")
    Department getHODNameByDepartmentName(String departmentName);
}
