package com.example.web;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements AccessMe{

	@Override
	public String sayHello(String name) {
		return "Hello " +name;
	}
	

}
