package com.sample.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {

    @Id
    @JsonProperty("hotel_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long hotelId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("location")
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getId() {
        return hotelId;
    }

    public void setId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Hotel() {
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

