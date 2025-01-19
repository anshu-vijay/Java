package com.sample.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rating {
    @JsonProperty("rating_id")
    private Long ratingId;
    @JsonProperty("user_id")
    private Long userId;
    @JsonProperty("hotel_id")
    private Long hotelId;
    private  int rating;
    private  String feedback;
    private Hotel hotel;

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId='" + ratingId + '\'' +
                ", userId='" + userId + '\'' +
                ", hotelId='" + hotelId + '\'' +
                ", rating=" + rating +
                ", feedback='" + feedback + '\'' +
                ", hotel=" + hotel +
                '}';
    }

    public Rating(Long ratingId, Long userId, Long hotelId, int rating, String feedback, Hotel hotel) {
        this.ratingId = ratingId;
        this.userId = userId;
        this.hotelId = hotelId;
        this.rating = rating;
        this.feedback = feedback;
        this.hotel = hotel;
    }

    public Rating() {
    }
}
