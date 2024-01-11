package com.sample.entity;

import java.sql.Blob;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@JsonInclude(Include.NON_NULL)
public class StudentAssignmentSubmission {

	@Id
	@GeneratedValue
	@JsonProperty("submission_id")
	private Long submissionId;
	

	@ManyToOne
	// @JsonProperty("student")
	@JoinColumn(name = "s_id", nullable = false)
	private Student student;

	@ManyToOne
	// @JsonProperty("assignment")
	@JoinColumn(name = "a_id", nullable = false)
	private Assignment assignment;

	@Column(nullable = false)
	@JsonIgnore
	private Blob file;

	@Column(nullable = false)
	@JsonProperty("file_size")
	private Long fileSize;

	@Column(nullable = false)
	@JsonProperty("file_name")
	private String fileName;

	@JsonProperty("submitted_by")
	@JoinColumn(name = "first_name", nullable = false)
	private String submittedBy;

	@Column(nullable = false)
	@JsonProperty("submission_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime submissionDate;

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

	public Blob getFile() {
		return file;
	}

	public void setFile(Blob file) {
		this.file = file;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSubmittedBy() {
		return submittedBy;
	}

	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}

	public LocalDateTime getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(LocalDateTime submissionDate) {
		this.submissionDate = submissionDate;
	}

	public Long getSubmissionId() {
		return submissionId;
	}

	public StudentAssignmentSubmission(Student student, Assignment assignment, Blob file, Long fileSize,
			String fileName, String submittedBy, LocalDateTime submissionDate) {
		this.student = student;
		this.assignment = assignment;
		this.file = file;
		this.fileSize = fileSize;
		this.fileName = fileName;
		this.submittedBy = submittedBy;
		this.submissionDate = submissionDate;
	}

	public StudentAssignmentSubmission() {
	}

}
