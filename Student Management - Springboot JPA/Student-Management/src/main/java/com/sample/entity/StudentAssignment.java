package com.sample.entity;

import jakarta.persistence.*;

@Entity
@IdClass(StudentAssignmentId.class)
public class StudentAssignment {

    @Id
    @ManyToOne
    @JoinColumn(name = "s_id")
    private Student student;

    @Id
    @ManyToOne
    @JoinColumn(name = "a_id")
    private Assignment assignment;

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


}
