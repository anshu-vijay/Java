package com.sample.dao;

import org.springframework.stereotype.Repository;
import com.sample.entity.Student;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ResourceRepository {

    private Map<Integer,Student> studentMap = new HashMap<Integer,Student>();

    public Student getStudentDetails(int id){
        Student student = studentMap.get(id);
        return student;
    }
}
