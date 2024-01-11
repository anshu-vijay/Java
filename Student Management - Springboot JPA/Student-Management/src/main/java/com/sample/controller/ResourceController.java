package com.sample.controller;

import com.sample.entity.Student;
import com.sample.exceptions.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.sample.services.ResourceService;
@RestController
public class ResourceController {

    @Autowired
    ResourceService resourceService;

    @GetMapping("/getStudentDetails/{id}")
    public Student getTeacherDetails(@PathVariable("id") int id){
        Student student = resourceService.getStudentDetails(id);
        if(student == null)
            throw new StudentNotFoundException();

        return student;
    }
}

