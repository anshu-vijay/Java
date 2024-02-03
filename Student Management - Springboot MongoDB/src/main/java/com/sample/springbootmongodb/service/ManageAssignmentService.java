package com.sample.springbootmongodb.service;

import com.sample.springbootmongodb.collection.Assignment;
import com.sample.springbootmongodb.repository.ManageAssignmentRepository;
import com.sample.springbootmongodb.repository.StudentAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class ManageAssignmentService {

    @Autowired
    private ManageAssignmentRepository manageAssignmentRepository;

    @Autowired
    StudentAssignmentRepository studentAssignmentRepository;

    @Transactional
    public List<Assignment> getAllAssignment() {
        List<Assignment> assignments = new ArrayList<>();
        manageAssignmentRepository.findAll().forEach(assignments1 -> assignments.add(assignments1));
        return assignments;
    }

    @Transactional
    public Assignment findByAssignmentName(String assignmentname) {
        return manageAssignmentRepository.findByAssignmentName(assignmentname);
    }

    @Transactional
    public Assignment saveOrUpdate(Assignment assignments) {
        return manageAssignmentRepository.save(assignments);
    }


    public Assignment getStartEndDateByAssignmentName(String assignmentname) {
        return manageAssignmentRepository.getStartEndDateByAssignmentName(assignmentname);
    }
}
