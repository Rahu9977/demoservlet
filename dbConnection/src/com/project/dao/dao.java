package com.project.dao;

import java.util.ArrayList;

import com.project.model.childModel;
import com.project.model.countryModel;
import com.project.model.firstModel;
import com.project.model.masterModel;
import com.project.model.secondModle;
import com.project.model.thirdModel;
import com.project.model.userModel;

public interface dao {

	boolean insert(userModel m);
	boolean insert(firstModel m);
	boolean insert(secondModle m);
	boolean insert(thirdModel m);
	
	boolean delete(int id);
	boolean deletep(int id);
	boolean deletee(int id);
	
	
	ArrayList check(userModel h);
	
	
	boolean insert(countryModel m);
	boolean insert(childModel m);
	boolean insert(masterModel m);
	ArrayList<userModel> view();
	ArrayList<userModel> viewe();
	
	ArrayList<countryModel> views();
	int getId();
	int getIds();
	int getIdd();
	
}
