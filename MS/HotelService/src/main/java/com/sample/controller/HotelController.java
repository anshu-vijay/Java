package com.sample.controller;

import com.sample.entity.Hotel;
import com.sample.service.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelServiceImpl hotelService;

    //create

    @PostMapping
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.saveHotel(hotel));
    }


    //get single

    @GetMapping("/{hotelId}")
    public ResponseEntity<Optional<Hotel>> getHotel(@PathVariable Long hotelId) {
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotel(hotelId));
    }


    //get all

    @GetMapping
    public ResponseEntity<List<Hotel>> getAll(){
        return ResponseEntity.ok(hotelService.getHotels());
    }


}