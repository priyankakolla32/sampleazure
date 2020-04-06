package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ServiceImplEx implements ServiceEx{

	public String getString(String name, String city) {
		String response = "STRING > Hi hello vanakkam! Mr/Ms. " + name + "::: YOur location is " + city;
		return response;
	}

	public String getObject(BeanEx exampleBean) {
		String response = "OBJECT > Hi hello vanakkam! Mr/Ms. " + exampleBean.getName() + "::: YOur location is "
				+ exampleBean.getCity();
		return response;
	}
	
}
