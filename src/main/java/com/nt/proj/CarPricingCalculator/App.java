package com.nt.proj.CarPricingCalculator;

import java.util.Scanner;

import com.nt.proj.cars.Car;
import com.nt.proj.factory.CarFactory;

public class App {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the country name:");
    	String country = sc.next();
    	System.out.println("Enter the price of the car:");
    	double price = sc.nextDouble();
    	//String country = "India";
    	
		//double price = 30000;
		
		try {
			Car car = CarFactory.createCar(country, price);
			System.out.println("The Final price of the Car is:"+car.calculateTotalPrice());
		}catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
    }
}
