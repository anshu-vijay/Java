package com.kodefyi.cityproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodefyi.cityproject.entity.City;
import com.kodefyi.cityproject.entity.CityName;
import com.kodefyi.cityproject.repository.CityRepository;
import com.kodefyi.cityproject.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	CityRepository cityRepository;

	@Override
	public List<City> addCity(List<City> city) {
		// TODO Auto-generated method stub
		return cityRepository.saveAll(city);
	}

	@Override
	public List<City> getCityWithPincodeRange(long start, long end) {
		// TODO Auto-generated method stub
		List<City> sorted_city = cityRepository.findAll().stream()
				.filter(x -> x.getPincode() >= start && x.getPincode() <= end).sorted(new CityName()).toList();
		return sorted_city;
	}

	@Override
	public List<City> getCityDataWithPincodeRange(long start, long end) {
		// TODO Auto-generated method stub
		List<City> sorted_city = cityRepository.findAll().stream()
				.filter(x -> x.getPincode() >= start && x.getPincode() <= end).sorted(new CityName()).toList();
		return sorted_city;
	}

}