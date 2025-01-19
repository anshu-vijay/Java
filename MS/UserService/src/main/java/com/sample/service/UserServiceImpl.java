package com.sample.service;

import com.sample.entity.Hotel;
import com.sample.entity.Rating;
import com.sample.entity.User;
import com.sample.exceptions.ResourceNotFoundException;
import com.sample.feign.external.service.HotelService;
import com.sample.feign.external.service.RatingService;
import com.sample.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RatingService ratingService;

    @Autowired
    private HotelService hotelService;

    @Override
    @Cacheable("users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public ResponseEntity<User> saveUser(User user) {
        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @Override
    public User getUser(Long userId) {

        User user = userRepository.findById(userId).orElseThrow(ResourceNotFoundException::new);

        /*      //Using Rest Template calling other microservices
        Rating[] ratingsOfUser = restTemplate.getForObject("http://RATINGSERVICE/ratings/users/" + userId, Rating[].class);
        assert ratingsOfUser != null;
        List<Rating> ratingList = Arrays.asList(ratingsOfUser);

        ratingList.forEach(rating -> {
            Hotel hotel = restTemplate.getForObject("http://HOTELSERVICE/hotels/" + rating.getHotelId(), Hotel.class);
            rating.setHotel(hotel);
        });*/

        List<Rating> ratingList = ratingService.getRatingsByUserId(userId);

        ratingList.forEach(rating -> {
            Hotel hotel = hotelService.getHotel(rating.getHotelId());
            rating.setHotel(hotel);
                }
        );
        user.setRatings(ratingList);
        return user;

    }
}
