package com.mca.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mca.AppConfig;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		FamliyDinner fam = app.getBean(FamliyDinner.class);
		fam.food();
		
		Restaurant res = app.getBean(Restaurant.class);
		res.hotel();
		
		app.close();
	}
}
