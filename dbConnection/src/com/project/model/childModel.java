package com.project.model;

import java.io.Serializable;

public class childModel  implements Serializable{
	
	private int child_id;
	private int mas_id;
	private String hobbi;
	
	public childModel(int mas_id, String hobbi) {
		super();
		this.mas_id = mas_id;
		this.hobbi = hobbi;
	}

	public int getChild_id() {
		return child_id;
	}

	public int getMas_id() {
		return mas_id;
	}

	public String getHobbi() {
		return hobbi;
	}
	
	
	

}
