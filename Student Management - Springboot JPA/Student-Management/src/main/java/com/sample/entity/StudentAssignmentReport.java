package com.sample.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class StudentAssignmentReport {

	@Id
	@GeneratedValue
	@JsonProperty("report_id")
	private Long reportId;

	@ManyToOne
	@JoinColumn(name = "s_id", nullable = false)
	private Student student;

	@ManyToOne
	@JoinColumn(name = "a_id", nullable = false)
	private Assignment assignment;

	@Column(nullable = false)
	private String score;

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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Assignment getAssignment() {
		return assignment;
	}

	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public Long getReportId() {
		return reportId;
	}

	public StudentAssignmentReport(Student student, Assignment assignment, String score) {
		this.student = student;
		this.assignment = assignment;
		this.score = score;
	}

	public StudentAssignmentReport() {
	}

}
