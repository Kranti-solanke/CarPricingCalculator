package com.nt.proj.countries;

import java.util.HashMap;
import java.util.Map;

import com.nt.proj.region.Region;

public class Countries {
	
	private static Map<String, Region> countries= new HashMap<>();
	
	static {
	countries.put("USA", Region.R1);
	countries.put("France", Region.R2);
	countries.put("Germany", Region.R2);
	countries.put("Spain", Region.R2);
	countries.put("India", Region.R3);
	countries.put("China", Region.R3);
	countries.put("Japan", Region.R3);
	countries.put("South Africa", Region.R4);
	countries.put("Algeria", Region.R4);
	}

	public static Map<String, Region> getCountries() {
		return countries;
	}

	public static void setCountries(Map<String, Region> countries) {
		Countries.countries = countries;
	}
	
	public static Region getCountry(String country) {
		return countries.getOrDefault(country, null);
	}
	

}
