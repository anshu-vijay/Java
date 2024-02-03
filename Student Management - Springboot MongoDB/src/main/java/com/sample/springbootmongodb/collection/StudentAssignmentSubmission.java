package com.sample.springbootmongodb.collection;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.sql.Blob;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentAssignmentSubmission {

    @Id
    private Long submissionId;

    @DBRef
    private Student student;

    @DBRef
    private Assignment assignment;

    @JsonIgnore
    private Blob file;

    @JsonProperty("file_size")
    private Long fileSize;

    @JsonProperty("file_name")
    private String fileName;

    @JsonProperty("submitted_by")
    private String submittedBy;

    @JsonProperty("submission_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime submissionDate;

    public StudentAssignmentSubmission(Student student, Assignment assignment, Blob file, Long fileSize, String fileName, String submittedBy) {
        this.student = student;
        this.assignment = assignment;
        this.file = file;
        this.fileSize = fileSize;
        this.fileName = fileName;
        this.submittedBy = submittedBy;
    }

    public StudentAssignmentSubmission() {
    }
}

