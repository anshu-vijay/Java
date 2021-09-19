package com.sample.springDemo;

public class HappyFortune implements FortuneService{

	@Override
	public String getFortune() {
		
		return "Lucky Day";
	}

}
