package com.sample.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;


public class StudentAssignmentId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "s_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "a_id")
    private Assignment assignment;


}
