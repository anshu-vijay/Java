package com.sample.controller;

import com.sample.commons.Status;
import com.sample.entity.Department;
import com.sample.entity.Student;
import com.sample.exceptions.StudentNotFoundException;
import com.sample.services.ManageDepartmentService;
import com.sample.services.ManageStudentService;
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

    @GetMapping("/all")
    private List<Student> getAllStudent() {
        return manageStudentService.getAllStudent();
    }

    @GetMapping("/{s_id}")
    private Student getStudent(@PathVariable("s_id") Long s_id) {
        return manageStudentService.getStudentById(s_id);
    }

    @PostMapping("/add")
    private Student saveStudent(@RequestBody Student students) {
        return manageStudentService.saveOrUpdate(students);
    }

    @PutMapping("/update")
    private Student update(@RequestBody Student students) {
        manageStudentService.saveOrUpdate(students);
        return students;
    }

    @GetMapping("/deactivate/{s_id}")
    private Student deactivateStudent(@PathVariable("s_id") Long s_id) {
        Student student = manageStudentService.getStudentById(s_id);

        student.setActiveFlag(Status.N);
        return manageStudentService.saveOrUpdate(student);
    }

    @GetMapping("/department/{d_id}")
    private List<Student> getStudentsByDepartmentId(@PathVariable("d_id") Long d_id) {
        Department department = manageDepartmentService.getDepartmentById(d_id);
        return department.getStudents();
    }

}
