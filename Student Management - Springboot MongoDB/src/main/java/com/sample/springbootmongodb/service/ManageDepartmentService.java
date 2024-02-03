package com.sample.springbootmongodb.service;


import com.sample.springbootmongodb.collection.Department;
import com.sample.springbootmongodb.repository.ManageDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManageDepartmentService {
    @Autowired
    private ManageDepartmentRepository manageDepartmentRepository;

    @Transactional
    public List<Department> getAllDepartment() {
        List<Department> departments = new ArrayList<Department>();
        manageDepartmentRepository.findAll().forEach(dpt -> departments.add(dpt));
        return departments;
    }

    @Transactional
    public Department findByDepartmentName(String departmentname) {
        return manageDepartmentRepository.findByDepartmentName(departmentname);
    }

    @Transactional
    public Department saveOrUpdate(Department department) {
        return manageDepartmentRepository.save(department);
    }


    @Transactional
    public Department getHODNameByDepartmentName(String dname) {
        return manageDepartmentRepository.getHODNameByDepartmentName(dname);
    }
}
