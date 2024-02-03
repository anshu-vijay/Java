package com.sample.springbootmongodb.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Setter
@Getter
@Document(collection = "s-a")
public class StudentAssignment {

    @DBRef
    private Student student;

    @DBRef
    private Assignment assignment;

    public StudentAssignment(Student student, Assignment assignment) {
        this.student = student;
        this.assignment = assignment;
    }

    public StudentAssignment() {
    }
}
