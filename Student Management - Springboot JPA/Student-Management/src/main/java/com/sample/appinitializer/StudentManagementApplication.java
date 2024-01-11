package com.sample.appinitializer;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.sample.dao.ManageAssignmentDao;
import com.sample.dao.ManageDepartmentDao;
import com.sample.dao.ManageStudentDao;
import com.sample.entity.Assignment;
import com.sample.entity.Department;
import com.sample.entity.Student;

@SpringBootApplication
@ComponentScan({ "com.sample" })
@EntityScan("com.sample.entity")
@EnableJpaRepositories("com.sample.dao")
@EnableScheduling
public class StudentManagementApplication implements CommandLineRunner {

	@Autowired
	private ManageStudentDao manageStudentDao;

	@Autowired
	private ManageDepartmentDao manageDepartmentDao;

	@Autowired
	private ManageAssignmentDao manageAssignmentDao;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		manageDepartmentDao.save(new Department("CSE", "Amit Saxena"));
		manageDepartmentDao.save(new Department("IT", "Rajeev Arya"));
		manageAssignmentDao.save(
				new Assignment("Assigment 1", LocalDateTime.of(2024, 1, 6, 0, 0), LocalDateTime.of(2024, 1, 15, 0, 0)));
		manageAssignmentDao.save(
				new Assignment("Assigment 2", LocalDateTime.of(2024, 1, 6, 0, 0), LocalDateTime.of(2024, 1, 10, 0, 0)));

		Department departmentCSE = manageDepartmentDao.findByDepartmentName("CSE");
		Department departmentIT = manageDepartmentDao.findByDepartmentName("IT");

		Assignment assignment1 = manageAssignmentDao.findByAssignmentName("Assignment 1");
		Assignment assignment2 = manageAssignmentDao.findByAssignmentName("Assignment 2");

//		manageStudentDao.save(new Student("Anshu", "Vijay", "Pune", departmentCSE));
//		manageStudentDao.save(new Student("Aarti", "Yadav", "Bhopal", departmentIT));

	}

}
