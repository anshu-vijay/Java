package com.sample.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sample.commons.Status;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@JsonInclude(Include.NON_NULL)
public class Student {
	@Id
	@GeneratedValue
	@JsonProperty("s_id")
	private Long sId;

	@Column
	@JsonProperty("first_name")
	private String firstName;

	@Column
	@JsonProperty("last_name")
	private String lastName;

	@Column
	@JsonProperty("city")
	private String city;

	@Column
	@UpdateTimestamp
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	@JsonProperty("updated_date")
	private LocalDateTime updatedDate;

	@Column(updatable = false)
	@CreationTimestamp
	@JsonIgnore
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime createdDate;

	@Column
	@Enumerated(EnumType.STRING)
	@JsonProperty("active_flag")
	private Status activeFlag = Status.Y;

	@ManyToOne
	@JsonProperty("department")
	@JoinColumn(name = "d_id")
//	@JsonIgnore
	private Department department;

	@OneToMany(mappedBy = "student")
	@JsonIgnore
	List<StudentAssignment> assignments = new ArrayList<StudentAssignment>();

	public List<StudentAssignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<StudentAssignment> assignments) {
		this.assignments = assignments;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedzdate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public Status getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Status activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Long getsId() {
		return sId;
	}

	public Student(String firstName, String lastName, String city, Department department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.department = department;
	}

	public Student() {
	}

}
