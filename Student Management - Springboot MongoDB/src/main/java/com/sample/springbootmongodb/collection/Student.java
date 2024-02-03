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
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "stud")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {

    @Id
    private String sId;

    @Getter
    @Setter
    @JsonProperty("first_name")
    private String firstName;

    @Getter
    @Setter
    @JsonProperty("last_name")
    private String lastName;


    @Setter
    @Field
    @JsonProperty("city")
    private String city;

    @Getter
    @Setter
    @LastModifiedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonProperty("updated_date")
    private LocalDateTime updatedDate;

    @Getter
    @CreatedDate
    @JsonIgnore
    private LocalDateTime createdDate;

    @Getter
    @Setter
    @JsonProperty("active_flag")
    private Status activeFlag = Status.Y;

    @Getter
    @Setter
    @DBRef
    @JsonProperty("department")
    private Department department;

    @Getter
    @Setter
    @DBRef
    @JsonIgnore
    List<StudentAssignment> assignments;

    public Student(String firstName, String lastName, String city, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.department = department;
    }
}
