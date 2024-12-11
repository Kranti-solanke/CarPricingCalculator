package com.nt.proj.cars;

public class USACar extends Car{


	public USACar(String country, double basePrice) {
		super(country, basePrice);
	}

	@Override
	public double calculateTax() {
		return getBasePrice() * 0.8;
	}
}
