package com.nt.proj.cars;

public class AsiaCar extends Car{

	public AsiaCar(String country, double basePrice) {
		super(country, basePrice);
	}

	@Override
	public double calculateTax() {
		return getBasePrice() * 0.15;
	}
	
}
