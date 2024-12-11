package com.nt.proj.cars;

 public abstract class Car {

	 private String country;
		private double basePrice;
		
		
		public Car(String country, double basePrice) {
			super();
			this.country = country;
			this.basePrice = basePrice;
			
		}

		public String getCountry() {
			return country;
		}

		public double getBasePrice() {
			return basePrice;
		}

		public abstract double calculateTax();
		
		public double calculateTotalPrice() {
			return basePrice + calculateTax();
		}
	}
	

