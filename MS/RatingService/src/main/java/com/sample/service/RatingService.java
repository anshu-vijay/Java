package com.sample.service;

import com.sample.entity.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating saveRating(Rating rating);

    //get all ratings
    List<Rating> getRatings();

    //get all by UserId
    List<Rating> getRatingByUserId(Long userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(Long hotelId);


}
