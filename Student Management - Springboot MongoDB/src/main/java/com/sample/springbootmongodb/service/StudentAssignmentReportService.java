package com.sample.springbootmongodb.service;

import com.sample.springbootmongodb.collection.StudentAssignmentReport;
import com.sample.springbootmongodb.repository.StudentAssignmentReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
public class StudentAssignmentReportService {

    @Autowired
    StudentAssignmentReportRepository studentAssignmentReportRepository;

    @Transactional
    public StudentAssignmentReport saveOrUpdate(StudentAssignmentReport studentAssignmentReport) {
        return studentAssignmentReportRepository.save(studentAssignmentReport);
    }

    @Transactional
    public boolean checkReportExists(String s_id, String a_id) {
        boolean flag = false;
        Iterable<StudentAssignmentReport> studentAssignmentReports = studentAssignmentReportRepository.findAll();
        for (StudentAssignmentReport report : studentAssignmentReports) {

            if (Objects.equals(report.getAssignment().getAId(), a_id) && Objects.equals(report.getStudent().getSId(), s_id)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
