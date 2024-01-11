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
import jakarta.persistence.OneToMany;

@Entity
@JsonInclude(Include.NON_NULL)
public class Department {
	@Id
	@GeneratedValue
	@JsonProperty("d_id")
	private Long dId;

	@Column
	@JsonProperty("department_name")
	private String departmentName;

	@Column
	@JsonProperty("hod_name")
	private String hodName;

	@Column
	@UpdateTimestamp
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
//	@JsonProperty("updated_date")
	@JsonIgnore
	private LocalDateTime updatedzdate;

	@Column(updatable = false)
	@CreationTimestamp
	@JsonIgnore
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
//	@JsonProperty("created_date")
	private LocalDateTime createdDate;

	@Column
	@Enumerated(EnumType.STRING)
	@JsonProperty("active_flag")
	private Status activeFlag = Status.Y;

	@OneToMany(mappedBy = "department")
	@JsonIgnore
	List<Student> students = new ArrayList<Student>();

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getHodName() {
		return hodName;
	}

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}

	public LocalDateTime getUpdatedzdate() {
		return updatedzdate;
	}

	public void setUpdatedzdate(LocalDateTime updatedzdate) {
		this.updatedzdate = updatedzdate;
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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Long getdId() {
		return dId;
	}

	public Department() {
	}

	public Department(String departmentName, String hodName) {
		this.departmentName = departmentName;
		this.hodName = hodName;
	}
	
	

}
