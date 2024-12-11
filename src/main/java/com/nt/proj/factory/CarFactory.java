package com.nt.proj.factory;

import com.nt.proj.cars.AfricaCar;
import com.nt.proj.cars.AsiaCar;
import com.nt.proj.cars.Car;
import com.nt.proj.cars.EuropeCar;
import com.nt.proj.cars.USACar;
import com.nt.proj.countries.Countries;
import com.nt.proj.region.Region;


public class CarFactory {

	public static Car createCar(String country, double basePrice) {
		Region region = Countries.getCountry(country);
	
	
	switch(region){
		case R1: 
			return new USACar(country, basePrice);
		case R2: 
			return new EuropeCar(country, basePrice);
		case R3: 
			return new AsiaCar(country, basePrice);
		case R4: 
			return new AfricaCar(country, basePrice);
		default:
			throw new IllegalArgumentException("No Country is available");
	}
   }

}
