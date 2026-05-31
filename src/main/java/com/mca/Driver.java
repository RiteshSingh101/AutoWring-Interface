package com.mca;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person p = app.getBean(Person.class);
		p.details();
		
		Aadhar adh = app.getBean(Aadhar.class);
		adh.show();
		app.close();
	}
}
