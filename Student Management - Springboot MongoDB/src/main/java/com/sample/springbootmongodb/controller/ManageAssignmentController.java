package com.sample.springbootmongodb.controller;

import com.sample.springbootmongodb.collection.Assignment;
import com.sample.springbootmongodb.collection.Assignment;
import com.sample.springbootmongodb.commons.Status;
import com.sample.springbootmongodb.service.ManageAssignmentService;
import com.sample.springbootmongodb.service.ManageStudentService;
import com.sample.springbootmongodb.service.StudentAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignment")
public class ManageAssignmentController {
    @Autowired
    ManageAssignmentService manageAssignmentService;

//    @Autowired
//    StudentAssignmentSubmissionService studentAssignmentSubmissionService;

    @Autowired
    ManageStudentService manageStudentService;

    @Autowired
    StudentAssignmentService studentAssignmentService;

    // Retrieves all the assignments details
    @GetMapping("/all")
    private List<Assignment> getAllAssignment() {
        return manageAssignmentService.getAllAssignment();
    }

    // Retrieves the detail of a specific assignment
    @GetMapping("/{assignmentname}")
    private Assignment findByAssignmentName(@PathVariable("assignmentname") String assignmentname) {
        return manageAssignmentService.findByAssignmentName(assignmentname);
    }

    // Add the assignment detail in the database
    @PostMapping("/add")
    private Assignment saveAssignment(@RequestBody Assignment assignments) {
        return manageAssignmentService.saveOrUpdate(assignments);
    }

    // Updates the assignment detail
    @PutMapping("/update")
    private Assignment update(@RequestBody Assignment assignments) {
        manageAssignmentService.saveOrUpdate(assignments);
        return assignments;
    }

    // Add the assignment detail in the database
    @GetMapping("/deactivate/{assignmentname}")
    private Assignment deactivateAssignment(@PathVariable("assignmentname") String assignmentname) {
        Assignment assignment = manageAssignmentService.findByAssignmentName(assignmentname);
        assignment.setActiveFlag(Status.N);
        return manageAssignmentService.saveOrUpdate(assignment);
    }

    @GetMapping("/dates/{assignmentname}")
    private Assignment getStartEndDateByAssignmentName(@PathVariable("assignmentname") String assignmentname) {
        Assignment assignment = manageAssignmentService.getStartEndDateByAssignmentName(assignmentname);
        return assignment;
    }

}