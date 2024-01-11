package com.kodefyi.cityproject.entity;

import java.util.Comparator;

public class CityName implements Comparator<City> {

	@Override
	public int compare(City o1, City o2) {
		// TODO Auto-generated method stub
		return o1.getCityName().compareTo(o2.getCityName());
	}

}
