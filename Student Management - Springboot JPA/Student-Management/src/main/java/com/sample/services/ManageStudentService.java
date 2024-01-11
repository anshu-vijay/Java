package com.sample.services;

import com.sample.dao.ManageStudentDao;
import com.sample.entity.Student;
import com.sample.exceptions.StudentNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManageStudentService {

    @Autowired
    private ManageStudentDao manageStudentDao;

    @Transactional
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<Student>();
        manageStudentDao.findAll().forEach(students1 -> students.add(students1));
        return students;
    }

    @Transactional
    public Student getStudentById(Long sid) {
        Student student = manageStudentDao.findById(sid).get();
        return manageStudentDao.findById(sid).get();
    }


    @Transactional
    public Student saveOrUpdate(Student students) {
        return manageStudentDao.save(students);
    }

}
