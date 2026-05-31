package com.mca.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

	@Value(value="1500")
	int bill;
	
//	@Autowired
	FamliyDinner fd;
	
	@Autowired
	public void setFamilyDinner(FamliyDinner f) {
		this.fd = f;
		System.out.println(f);
	}

	
	
	public void hotel() {
		System.out.println("5-star hotel..");
		System.out.println("Bill: "+bill);
	}
}
