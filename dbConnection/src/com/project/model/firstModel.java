package com.project.model;

import java.io.Serializable;

public class firstModel implements Serializable {
	
	private int fid;
	private String fname;
	public firstModel(String fname) {
		super();
		this.fname = fname;
	}
	public int getFid() {
		return fid;
	}
	public String getFname() {
		return fname;
	}
	
	

}
