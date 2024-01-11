package com.kodefyi.cityproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodefyi.cityproject.entity.City;

public interface CityRepository extends JpaRepository<City, Integer> {

}
