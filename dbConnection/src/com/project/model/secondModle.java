package com.project.model;

import java.io.Serializable;

public class secondModle implements Serializable {
	
	private int sid;
	private int fid;
	private String email;
	public secondModle(int fid, String email) {
		super();
		this.fid = fid;
		this.email = email;
	}
	public int getSid() {
		return sid;
	}
	public int getFid() {
		return fid;
	}
	public String getEmail() {
		return email;
	}
	
	

}
