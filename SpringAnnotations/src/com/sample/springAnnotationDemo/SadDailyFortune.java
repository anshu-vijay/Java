package com.sample.springAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class SadDailyFortune implements FortuneService{

	@Override
	public String getFortune() {
		return "Bad Day";
	}

}
