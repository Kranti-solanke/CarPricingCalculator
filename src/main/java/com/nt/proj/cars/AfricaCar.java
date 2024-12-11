package com.nt.proj.cars;

public class AfricaCar extends Car{


	public AfricaCar(String country, double basePrice) {
		super(country, basePrice);
	}

	@Override
	public double calculateTax() {
		return getBasePrice() * 0.10;
	}
}
