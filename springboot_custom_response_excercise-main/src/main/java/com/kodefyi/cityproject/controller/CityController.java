package com.kodefyi.cityproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodefyi.cityproject.entity.City;
import com.kodefyi.cityproject.handler.ResponseHandler;
import com.kodefyi.cityproject.service.CityService;

@RestController
@RequestMapping(value = "/city")
public class CityController {

	@Autowired
	CityService cityService;

	@PostMapping("/addcity")
	public List<City> addCity(@RequestBody List<City> city) {
		return cityService.addCity(city);
	}

	@GetMapping("/getcitywithpincode")
	public ResponseEntity<Object> getCityWithPincode(@RequestParam long startpostcoderange,
			@RequestParam long endpostcoderange) {
		List<City> data = cityService.getCityWithPincodeRange(startpostcoderange, endpostcoderange);

		String str = "";
		for (City list : data) {
			str += list.getCityName();
		}

		return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, data, str.length());
	}
	
	@GetMapping("/getcitydatawithpincode")
	public List<City> getCityDataWithPincode(@RequestParam long startpostcoderange,
			@RequestParam long endpostcoderange) {
		List<City> data = cityService.getCityDataWithPincodeRange(startpostcoderange, endpostcoderange);

		return data;
	}

}
