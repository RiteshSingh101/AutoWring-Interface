package com.mca.spring;

import org.springframework.stereotype.Component;

@Component
public class VegHotel implements FamliyDinner{
	
	@Override
	public void food() {
		System.out.println("Veg-Pulao...");
	}
}
