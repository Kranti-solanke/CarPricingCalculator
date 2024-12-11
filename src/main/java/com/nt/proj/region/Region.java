package com.nt.proj.region;

public enum Region {
	
	R1("USA"),
	R2("Europe"),
	R3("Asia"),
	R4("Africa");
	
   public String contenment;

	private Region(String contenment) {
		this.contenment = contenment;
	}

	public String getContenment() {
		return contenment;
	}	
}


