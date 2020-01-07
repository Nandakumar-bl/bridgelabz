package com.bridgelabz.springpractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.beans.Car;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Car car = (Car) context.getBean("car");
		car.getEngine().getCc();
		car.getWheel().setBrand("CEAT");

	}
}
