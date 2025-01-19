package com.sample.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hotel {
@JsonProperty("hotel_id")
    private  Long hotelId;
    private  String name;
    private  String location;

    public Hotel(Long hotelId, String name, String location) {
        this.hotelId = hotelId;
        this.name = name;
        this.location = location;
    }

    public Hotel() {
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId='" + hotelId + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

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
}
