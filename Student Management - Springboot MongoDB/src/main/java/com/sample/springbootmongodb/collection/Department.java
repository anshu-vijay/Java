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
@Document(collection = "dept")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Department {

    @Id
    private String dId;

    @Getter
    @Setter
    @JsonProperty("department_name")
    private String departmentName;

    @Getter
    @Setter
    @JsonProperty("hod_name")
    private String hodName;

    @Getter
    @Setter
    @LastModifiedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonProperty("updated_date")
    private LocalDateTime updatedDate;

    @Getter
    @Setter
    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonProperty("created_date")
    private LocalDateTime createdDate;

    @Getter
    @Setter
    @JsonProperty("active_flag")
    private Status activeFlag = Status.Y;

    @Getter
    @Setter
    @DBRef
    @JsonProperty("students")
    @JsonIgnore
    private List<Student> students;

    public Department() {
    }

    public Department(String departmentName, String hodName) {
        this.departmentName = departmentName;
        this.hodName = hodName;
    }
}
