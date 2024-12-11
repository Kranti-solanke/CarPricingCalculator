package com.nt.proj.cars;

public class EuropeCar extends Car{

	public EuropeCar(String country, double basePrice) {
		super(country, basePrice);
	}

	@Override
	public double calculateTax() {
		return getBasePrice() * 0.20;
	}
	
}
