package com.sample.springbootmongodb;

import com.sample.springbootmongodb.collection.Assignment;
import com.sample.springbootmongodb.collection.Department;
import com.sample.springbootmongodb.collection.Student;
import com.sample.springbootmongodb.repository.ManageAssignmentRepository;
import com.sample.springbootmongodb.repository.ManageDepartmentRepository;
import com.sample.springbootmongodb.repository.ManageStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableMongoAuditing
@EnableMongoRepositories("com.sample.springbootmongodb.repository")
public class SpringbootMongodbApplication implements CommandLineRunner {
    @Autowired
    private ManageStudentRepository manageStudentRepository;

    @Autowired
    private ManageDepartmentRepository manageDepartmentRepository;

    @Autowired
    private ManageAssignmentRepository manageAssignmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongodbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        manageDepartmentRepository.save(new Department("CSE", "Amit Saxena"));
//        manageDepartmentRepository.save(new Department("IT", "Rajeev Arya"));
//        manageAssignmentRepository.save(
//                new Assignment("Assignment 1", LocalDateTime.of(2024, 1, 6, 0, 0), LocalDateTime.of(2024, 1, 15, 0, 0)));
//        manageAssignmentRepository.save(
//                new Assignment("Assignment 2", LocalDateTime.of(2024, 1, 6, 0, 0), LocalDateTime.of(2024, 1, 10, 0, 0)));
//
//        Department departmentCSE = manageDepartmentRepository.findByDepartmentName("CSE");
//        Department departmentIT = manageDepartmentRepository.findByDepartmentName("IT");
//
//		manageStudentRepository.save(new Student("Anshu", "Vijay", "Pune", departmentCSE));
//		manageStudentRepository.save(new Student("Aarti", "Yadav", "Bhopal", departmentIT));

    }


}
