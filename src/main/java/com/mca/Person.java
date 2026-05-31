package com.mca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	Aadhar aadhar;
	
	public void details() {
		
		aadhar.show();
		System.out.println("Person have Aadhar card details "+aadhar.getClass().getSimpleName());
	}
}
