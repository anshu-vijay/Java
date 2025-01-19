package com.sample.controller;

import com.sample.entity.User;
import com.sample.service.UserServiceImpl;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
//    @CircuitBreaker(name = "ratingHotelBreaker", fallbackMethod = "ratingHotelFallback")
//    @Retry(name = "ratingHotelService", fallbackMethod = "ratingHotelFallback")
    @RateLimiter(name = "userRateLimiter", fallbackMethod = "ratingHotelFallback")
    public ResponseEntity<User> getUser(@PathVariable("userId") Long userId){
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    public ResponseEntity<User> ratingHotelFallback(Long userId, Exception ex) {
//        logger.info("Fallback is executed because service is down : ", ex.getMessage());
        ex.printStackTrace();
        User user = new User();
        user.setName("John");
        user.setEmail("john@microservices.com");
        user.setAbout("External service(s) is/are down. Please contact for any clarification.");
        return new ResponseEntity<>(user, HttpStatus.BAD_REQUEST);
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }


}
