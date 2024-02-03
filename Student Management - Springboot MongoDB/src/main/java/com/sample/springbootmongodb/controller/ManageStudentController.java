package com.sample.springbootmongodb.controller;

import com.sample.springbootmongodb.collection.Department;
import com.sample.springbootmongodb.commons.Status;
import com.sample.springbootmongodb.collection.Student;

import com.sample.springbootmongodb.repository.ManageDepartmentRepository;
import com.sample.springbootmongodb.service.ManageDepartmentService;
import com.sample.springbootmongodb.service.ManageStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class ManageStudentController {

    @Autowired
    ManageStudentService manageStudentService;

    @Autowired
    ManageDepartmentService manageDepartmentService;

    @Autowired
    private ManageDepartmentRepository manageDepartmentRepository;

    @GetMapping("/city/{cityname}")
    private List<Student> getHODNameByDepartmentName(@PathVariable("cityname") String cityname) {
        List<Student> students = manageStudentService.getStudentNameByCity(cityname);
        return students;
    }

    @GetMapping("/firstname/{firstname}")
    private Student findByFirstName(@PathVariable("firstname") String firstname) {
        return manageStudentService.findByFirstName(firstname);
    }


    @GetMapping("/all")
    private List<Student> getAllStudent() {
        return manageStudentService.getAllStudent();
    }

//    @GetMapping("/{s_id}")
//    private Student getStudent(@PathVariable("s_id") Long s_id) {
//        return manageStudentService.getStudentById(s_id);
//    }

    @PostMapping("/add")
    private Student saveStudent(@RequestBody Student students) {
        return manageStudentService.saveOrUpdate(students);
    }

    @PutMapping("/update")
    private Student update(@RequestBody Student students) {
        manageStudentService.saveOrUpdate(students);
        return students;
    }

    @GetMapping("/deactivate/{studentname}")
    private Student deactivateStudent(@PathVariable("studentname") String studentname) {
        Student student = manageStudentService.findByFirstName(studentname);

        student.setActiveFlag(Status.N);
        return manageStudentService.saveOrUpdate(student);
    }



}
