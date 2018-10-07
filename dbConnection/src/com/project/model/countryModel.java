package com.project.model;

import java.io.Serializable;
import java.util.Date;

public class countryModel implements Serializable {

	private byte cid;
	private String cname;
	private int created_by_id;
	private Date created_by_date;
	private String created_mac;
	
	private String uname;
	
	public countryModel(String cname, int created_by_id,String created_mac) {
		
		super();
		this.cname = cname;
		this.created_by_id = created_by_id;
	    this.created_mac = created_mac;
	}
	
	
	
	public String getCreated_mac() {
		return created_mac;
	}



	public int getCreated_by_id() {
		return created_by_id;
	}
	public Date getCreated_by_date() {
		return created_by_date;
	}
	public countryModel(byte cid, String cname, String uname, Date created_by_date,String created_mac) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.uname = uname;
		this.created_by_date = created_by_date;
	    this.created_mac = created_mac;
	}
	
	
	
	public String getUname() {
		return uname;
	}



	public countryModel(String cname) {
		super();
		this.cname = cname;
	}
	public byte getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	
	public countryModel(byte cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	
}
