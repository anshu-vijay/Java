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
public class Assignment {

	@Id
	@GeneratedValue
	@JsonProperty("a_id")
	private Long aId;

	@Column
	@JsonProperty("assignment_name")
	private String assignmentName;

	@Column
	@JsonProperty("assignment_start_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime assignmentStartDate;

	@Column
	@JsonProperty("assignment_end_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime assignmentEndDate;

	@Column
	@UpdateTimestamp
	@JsonIgnore
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime updatedzdate;

	@Column(updatable = false)
	@CreationTimestamp
	@JsonIgnore
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime createdDate;

	@Column
	@Enumerated(EnumType.STRING)
	@JsonProperty("active_flag")
	private Status activeFlag = Status.Y;

	@OneToMany(mappedBy = "assignment")
	@JsonIgnore
	List<StudentAssignment> students = new ArrayList<StudentAssignment>();

	public List<StudentAssignment> getStudents() {
		return students;
	}

	public void setStudents(List<StudentAssignment> students) {
		this.students = students;
	}

	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public LocalDateTime getAssignmentStartDate() {
		return assignmentStartDate;
	}

	public void setAssignmentStartDate(LocalDateTime assignmentStartDate) {
		this.assignmentStartDate = assignmentStartDate;
	}

	public LocalDateTime getAssignmentEndDate() {
		return assignmentEndDate;
	}

	public void setAssignmentEndDate(LocalDateTime assignmentEndDate) {
		this.assignmentEndDate = assignmentEndDate;
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

	public Long getaId() {
		return aId;
	}

	public Assignment(String assignmentName, LocalDateTime assignmentStartDate, LocalDateTime assignmentEndDate) {
		this.assignmentName = assignmentName;
		this.assignmentStartDate = assignmentStartDate;
		this.assignmentEndDate = assignmentEndDate;
	}

	public Assignment() {
	}

}
