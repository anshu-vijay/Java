package com.sample.springbootmongodb.collection;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Setter
@Getter
@Document
public class StudentAssignmentReport {

    @Id
    private Long reportId;

    @DBRef
    private Student student;

    @DBRef
    private Assignment assignment;

    private String score;


    @LastModifiedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonProperty("updated_date")
    private LocalDateTime updatedDate;

    @CreatedDate
    @JsonIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime createdDate;

    public StudentAssignmentReport(Student student, Assignment assignment, String score) {
        this.student = student;
        this.assignment = assignment;
        this.score = score;
    }
    public StudentAssignmentReport() {
    }

}
