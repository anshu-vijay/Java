package com.sample.springbootmongodb.service;

import com.sample.springbootmongodb.collection.Assignment;
import com.sample.springbootmongodb.collection.Student;
import com.sample.springbootmongodb.collection.StudentAssignment;
import com.sample.springbootmongodb.repository.StudentAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class StudentAssignmentService {

    @Autowired
    StudentAssignmentRepository studentAssignmentRepository;

    @Transactional
    public StudentAssignment saveOrUpdate(StudentAssignment studentAssignment) {
        return studentAssignmentRepository.save(studentAssignment);
    }

    @Transactional
    public List<StudentAssignment> getStudentAssignmentList() {
        return studentAssignmentRepository.findAll();
    }

    @Transactional
    public List<StudentAssignment> getAssignmentsOfStudent(String studentId) {
        List<StudentAssignment> assignments = studentAssignmentRepository.findAllAssignmentsOfStudent(studentId);

        return assignments;
    }

    public boolean checkAlreadyAssigned(String sId, String aId) {
        boolean flag = false;
        Iterable<StudentAssignment> studentAssignments = studentAssignmentRepository.findAll();
        for (StudentAssignment assignment : studentAssignments) {

            if (Objects.equals(assignment.getAssignment().getAId(), aId) && Objects.equals(assignment.getStudent().getSId(), sId)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public List<StudentAssignment> findAssignmentPendingWithStudent() {
        List<StudentAssignment> student_assignments = studentAssignmentRepository.findAssignmentPendingWithStudent();
        return student_assignments;
    }
}