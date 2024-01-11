package com.sample.services;

import com.sample.dao.ResourceRepository;
import com.sample.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ResourceService {

    @Autowired
    ResourceRepository repository;

    public Student getStudentDetails(int id){
        return repository.getStudentDetails(id);
    }
}