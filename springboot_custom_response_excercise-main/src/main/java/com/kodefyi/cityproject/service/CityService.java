package com.kodefyi.cityproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodefyi.cityproject.entity.City;

@Service
public interface CityService {

	List<City> addCity(List<City> city);

	List<City> getCityWithPincodeRange(long start, long end);
	
	List<City> getCityDataWithPincodeRange(long start, long end);
}
