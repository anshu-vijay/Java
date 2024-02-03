package com.sample.springbootmongodb.collection;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sample.springbootmongodb.commons.Status;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "asmt")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Assignment {

    @Id
    @Getter
    @Setter
    private String aId;

    @Getter
    @Setter
    @JsonProperty("assignment_name")
    private String assignmentName;


    @Getter
    @Setter
    @JsonProperty("assignment_start_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime assignmentStartDate;


    @Getter
    @Setter
    @JsonProperty("assignment_end_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime assignmentEndDate;

    @Getter
    @Setter
    @LastModifiedDate
    @JsonIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime updatedzdate;


    @Getter
    @Setter
    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime createdDate;


    @Getter
    @Setter
    @JsonProperty("active_flag")
    private Status activeFlag = Status.Y;

    @DBRef
    @JsonIgnore
    List<StudentAssignment> students;


    public Assignment(String assignmentName, LocalDateTime assignmentStartDate, LocalDateTime assignmentEndDate) {
        this.assignmentName = assignmentName;
        this.assignmentStartDate = assignmentStartDate;
        this.assignmentEndDate = assignmentEndDate;
    }

    public Assignment() {
    }

}

