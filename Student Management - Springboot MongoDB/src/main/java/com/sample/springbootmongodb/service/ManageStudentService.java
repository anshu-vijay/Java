package com.sample.springbootmongodb.service;


import com.sample.springbootmongodb.collection.Student;
import com.sample.springbootmongodb.repository.ManageStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManageStudentService {

    @Autowired
    private ManageStudentRepository manageStudentRepository;

    @Transactional
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<Student>();
        manageStudentRepository.findAll().forEach(students1 -> students.add(students1));
        return students;
    }

    @Transactional
    public Student findByFirstName(String studentname) {
        return manageStudentRepository.findByFirstName(studentname);
    }


    @Transactional
    public Student saveOrUpdate(Student students) {
        return manageStudentRepository.save(students);
    }

    public List<Student> getStudentNameByCity(String cityname) {
        return manageStudentRepository.getStudentNameByCityName(cityname);
    }
}
