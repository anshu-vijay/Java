package com.sample.springbootmongodb.controller;


import com.sample.springbootmongodb.collection.Department;
import com.sample.springbootmongodb.collection.Student;
import com.sample.springbootmongodb.commons.Status;
import com.sample.springbootmongodb.service.ManageDepartmentService;
import com.sample.springbootmongodb.repository.ManageStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/department")
public class ManageDepartmentController {

    @Autowired
    ManageDepartmentService manageDepartmentService;

    // Retrieves all the departments details
    @GetMapping("/all")
    private List<Department> getAllDepartment() {
        return manageDepartmentService.getAllDepartment();
    }

    // Retrieves the detail of a specific department
    @GetMapping("/{departmentname}")
    private Department getDepartment(@PathVariable("departmentname") String departmentname) {
        return manageDepartmentService.findByDepartmentName(departmentname);
    }

    // Add the department detail in the database
    @PostMapping("/add")
    private Department saveDepartment(@RequestBody Department departments) {
        return manageDepartmentService.saveOrUpdate(departments);
    }

    // Updates the department detail
    @PutMapping("/update")
    private Department update(@RequestBody Department department) {
        manageDepartmentService.saveOrUpdate(department);
        return department;
    }

    // Add the department detail in the database
    @GetMapping("/deactivate/{departmentname}")
    private Department deactivateDepartment(@PathVariable("departmentname") String departmentname) {
        Department department = manageDepartmentService.findByDepartmentName(departmentname);
        department.setActiveFlag(Status.N);
        return manageDepartmentService.saveOrUpdate(department);
    }

//    @GetMapping("/students/{departmentid}")
//    private List<Student> getStudentsByDepartmentId(@PathVariable("departmentid") Long departmentid){
//        Department department = manageDepartmentService.getDepartmentById(departmentid);
//        List<Student> students = department.getStudents();
//        return students;
//    }

    @GetMapping("/name/{dname}")
    private Department getHODNameByDepartmentName(@PathVariable("dname") String dname) {
       Department department = manageDepartmentService.getHODNameByDepartmentName(dname);
        return department;
    }

}
