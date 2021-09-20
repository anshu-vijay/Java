package com.sample.springAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class DailyFortune implements FortuneService {

	@Override
	public String getFortune() {
		
		return "It's your Lucky Day";
	}

}
