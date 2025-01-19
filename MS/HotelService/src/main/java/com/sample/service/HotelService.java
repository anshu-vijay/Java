package com.sample.service;

import com.sample.entity.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    Hotel saveHotel(Hotel hotel);

    //get all
    List<Hotel> getHotels();

    //get single
    Optional<Hotel> getHotel(Long hotelId);


}
