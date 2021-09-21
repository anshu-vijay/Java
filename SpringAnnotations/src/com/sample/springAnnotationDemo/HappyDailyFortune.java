package com.sample.springAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyDailyFortune implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Lucky Day";
	}

}
