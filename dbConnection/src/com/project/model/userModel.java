package com.project.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class userModel implements Serializable{

	private int id;
	private String fname;
	private long number;
	private String gender;
	private byte cid;
	private Date dc;
	private String address;
	private String hobbi;
	private byte active_flag;
	

	
	
	public userModel(int id, String fname) {
		super();
		this.id = id;
		this.fname = fname;
	}




	public userModel(String fname, long number) {
		super();
		this.fname = fname;
		this.number = number;
	}




	public userModel(String fname, long number,Date f , String gender, byte country, String address, String hobbi) {
		super();
		this.fname = fname;
		this.dc = f;
		this.number = number;
		this.gender = gender;
		this.cid = country;
		this.address = address;
		this.hobbi = hobbi;
	}

	
	
	
	public byte getCid() {
		return cid;
	}




	public Date getDc() {
	
		
		java.sql.Date jn = new java.sql.Date(dc.getTime());
		
		return jn;
	}




	public userModel(int id, String fname, long number, String gender, byte country, String address, String hobbi,byte a) {
		super();
		this.id = id;
		this.fname = fname;
		this.number = number;
		this.gender = gender;
		this.cid = country;
		this.address = address;
		this.hobbi = hobbi;
		this.active_flag = a;
	}




	public byte getActive_flag() {
		return active_flag;
	}




	public String getGender() {
		return gender;
	}



	public byte getCountry() {
		return cid;
	}



	public String getAddress() {
		return address;
	}



	public String getHobbi() {
		return hobbi;
	}



	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public long getNumber() {
		return number;
	}
	
	
	
	
}
