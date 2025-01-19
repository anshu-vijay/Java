package com.sample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @JsonProperty("rating_id")
    private Long ratingId;

    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("hotel_id")
    private Long hotelId;

    @JsonProperty("rating")
    private int rating;

    @JsonProperty("feedback")
    private String feedback;

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

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public Rating(Long userId, Long hotelId, int rating, String feedback) {
        this.userId = userId;
        this.hotelId = hotelId;
        this.rating = rating;
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId=" + ratingId +
                ", userId='" + userId + '\'' +
                ", hotelId='" + hotelId + '\'' +
                ", rating=" + rating +
                ", feedback='" + feedback + '\'' +
                '}';
    }

    public Rating() {
    }
}