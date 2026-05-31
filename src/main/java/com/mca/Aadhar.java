package com.mca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Aadhar {
	
	@Value(value="123456789")
	int ahr;
	
	@Autowired
	Person person;
	
	public void show() {
		
		System.out.println("Aadhar card no. "+ahr);
		System.out.println("Person class name: " + person.getClass().getSimpleName());
	}
}
