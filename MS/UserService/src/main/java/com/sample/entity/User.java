package com.sample.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("about")
    private String about;

    @Transient
    private List<Rating> ratings=new ArrayList<>();

/*    Compares the current object (this) with another object.
    It considers two users equal if their userId and email are the same.
    These fields are likely to uniquely identify a user in your application.*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(email, user.email);
    }
/*  Generates  Generates a hash code based on userId and email.
    This ensures that objects that are equal (equals returns true) will have the same hash code,
    fulfilling the contract between equals and hashCode.*/
    @Override
    public int hashCode() {
        return Objects.hash(userId, email);
    }

    public User(Long userId, String name, String email, String about, List<Rating> ratings) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.about = about;
        this.ratings = ratings;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", about='" + about + '\'' +
                ", ratings=" + ratings +
                '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
