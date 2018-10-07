package com.project.model;

import java.io.Serializable;

public class masterModel implements Serializable {

	private int mas_id;
	private String fname;
	private long number;
	private String gender;
	private String country;
	private String address;
	
	public masterModel(String fname, long number, String gender, String country, String address) {
		super();
		this.fname = fname;
		this.number = number;
		this.gender = gender;
		this.country = country;
		this.address = address;
	}
	public int getMas_id() {
		return mas_id;
	}
	public String getFname() {
		return fname;
	}
	public long getNumber() {
		return number;
	}
	public String getGender() {
		return gender;
	}
	public String getCountry() {
		return country;
	}
	public String getAddress() {
		return address;
	}

	
	
	
}
