package com.sample.feign.external.service;

import com.sample.entity.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "RATINGSERVICE")
public interface RatingService {

    @GetMapping("ratings/users/{userId}")
    public List<Rating> getRatingsByUserId(@PathVariable Long userId);
}

