package com.project.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.project.dao.dao;
import com.project.daoImpl.daoImpl;
import com.project.model.countryModel;
import com.project.model.userModel;

public class fileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public fileController() {
        super();
    }

    private  String sd = "";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   try
   {
		int u = Integer.parseInt(request.getParameter("a"));
	dao d = new daoImpl();
   switch (u) {
	case 0:
	 
		sd = "login.jsp";
		
		break;
	case 44:
		
		sd = "home.jsp";
		
		break;
	case 1:
		
		ArrayList<countryModel> ls = d.views(); 
		request.setAttribute("list",ls);	
		
		
		sd = "home.jsp?p=first";
		
		break;
	case 3:
		
		sd = "home.jsp?p=triji";
		
		break;
	case 5:
		
		sd = "home.jsp?p=tran";
		
		break;
	case 4:
	
	sd = "home.jsp?p=country";
	
	break;
	
	case 2:
	    
		ArrayList<userModel> l = d.viewe(); 
		request.setAttribute("list",l);	
		sd = "home.jsp?p=view";
		
		break;
	
	case 9:
	    
		 ls = d.views(); 
		request.setAttribute("list",ls);	
		sd = "home.jsp?p=viewcountry";
		
		break;
	
		
	case 6:
	    
		 l = d.view(); 
		request.setAttribute("list",l);	
		sd = "home.jsp?p=viewa";
		
		break;
	
	
	default:
		break;
	}	
	RequestDispatcher rd = request.getRequestDispatcher(sd);
    rd.forward(request, response);
   }
   catch (Exception e) {
	response.sendRedirect("error.jsp");
}
	
	}

}
