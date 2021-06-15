package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.model.Employee;
import com.example.web.AccessMe;

@SpringBootApplication
public class Batch55Exx2SBootApplication implements CommandLineRunner{
	@Autowired //note creating access=new Helloservice.
	AccessMe access;
	@Autowired //note emp=new Employee.
	Employee emp;
	
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Batch55Exx2SBootApplication.class, args);
		AccessMe access=ctx.getBean(AccessMe.class); //polymorphism,creating an instance similar to Access=new HelloService
	
		Employee emp= ctx.getBean(Employee.class);
		emp.setName("Jacob");
		//System.out.println(access.sayHello(emp.getName()));
		System.out.println(emp.getName());
		
	}

	@Override
	public void run(String... args) throws Exception {
		emp.setName("Grace");
		System.out.println(access.sayHello(emp.getName()));//with the implementation class of commandlineRunner we can call this meth.
	}

}
