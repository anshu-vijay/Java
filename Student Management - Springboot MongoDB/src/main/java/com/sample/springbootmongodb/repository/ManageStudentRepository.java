package com.sample.springbootmongodb.repository;

import java.io.Serializable;
import java.util.List;

import com.sample.springbootmongodb.collection.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ManageStudentRepository extends MongoRepository<Student, Serializable> {

    @Query(value="{ city : ?0}", fields="{ firstName : 1 , lastName :  1}")
    List<Student> getStudentNameByCityName(String cityName);

    Student findByFirstName(String studentName);
}
