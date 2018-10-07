package com.project.model;

import java.io.Serializable;

public class thirdModel implements Serializable {
	
	private int tid;
	private int sid;
	private long mobile;
	public thirdModel(int sid, long mobile) {
		super();
		this.sid = sid;
		this.mobile = mobile;
	}
	public int getTid() {
		return tid;
	}
	public int getSid() {
		return sid;
	}
	public long getMobile() {
		return mobile;
	}
	

	
	
}
