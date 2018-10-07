package com.project.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.dao.dao;
import com.project.daoImpl.daoImpl;
import com.project.model.childModel;
import com.project.model.countryModel;
import com.project.model.firstModel;
import com.project.model.masterModel;
import com.project.model.secondModle;
import com.project.model.thirdModel;
import com.project.model.userModel;

public class insertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public insertController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			dao s = new daoImpl();
			byte d = Byte.parseByte(request.getParameter("a"));
			int id;
			boolean b;
			switch (d) {
			case 1:

				id = Integer.parseInt(request.getParameter("id"));
				b = s.delete(id);
				if (b) {
					response.sendRedirect("papa.mummy?a=2");
				} else {
					response.sendRedirect("error.jsp");
				}
				break;
			case 2:

				id = Integer.parseInt(request.getParameter("id"));
				b = s.deletep(id);
				if (b) {
					response.sendRedirect("papa.mummy?a=2");
				} else {
					response.sendRedirect("error.jsp");
				}
				break;

			case 3:

				id = Integer.parseInt(request.getParameter("id"));
				b = s.deletee(id);
				if (b) {
					response.sendRedirect("papa.mummy?a=6");
				} else {
					response.sendRedirect("error.jsp");
				}
				break;
			case 7:
				HttpSession de = request.getSession();
				de.removeAttribute("is");
				de.removeAttribute("fn");
				de.invalidate();
				response.sendRedirect("papa.mummy?a=0");
				break;
			default:
				break;
			}

		} catch (Exception e) {
			response.sendRedirect("error.jsp");
		}
	}

	 private static String GetMacAddress() throws UnknownHostException,
     SocketException{
	       String address = null;
	        try {
	        	
	        	InetAddress ip = InetAddress.getLocalHost();
	            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
	            byte[] mac = network.getHardwareAddress();
	           
	            StringBuilder sb = new StringBuilder();
	            for (int i = 0; i < mac.length; i++) {
	            	
	                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
	                
	            }
	            
	            address = sb.toString();
	           
	        } catch (SocketException e) {

	            e.printStackTrace();

	        }

	       return address;
	   }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try
{
	HttpSession ses = request.getSession();
	
	SimpleDateFormat jx = new SimpleDateFormat("yyyy-MM-dd");
	dao d = new daoImpl();
	boolean b = false;
	String ac = request.getParameter("acd");
	switch (ac) {

	case "login":
		
		String uname = request.getParameter("uname");
		long pass = Long.parseLong(request.getParameter("pass"));
		
		userModel kn = new userModel(uname, pass);
		
		
		ArrayList in = d.check(kn);
		
		
		switch ((String)in.get(0)) {
		case "wu":
			ses.setAttribute("msg","wrong username!!");
			
			response.sendRedirect("papa.mummy?a=0");
	
			break;
		case "wp":
ses.setAttribute("msg","wrong password!!");
			
			response.sendRedirect("papa.mummy?a=0");
			break;
		case "wb":
	ses.setAttribute("msg","you are blocked papu!!");
			
			response.sendRedirect("papa.mummy?a=0");
			
			break;
		case "ws":
			userModel jn =(userModel) in.get(1);
			ses.setAttribute("is",jn.getId());
			ses.setAttribute("fn",jn.getFname());
			
			
			response.sendRedirect("papa.mummy?a=44");
	
			break;
		default:
			break;
		}
		break;
	
	
	case "tapu":

		String cname =	request.getParameter("cname");
		
		countryModel cv = new cou(cname,(int)ses.getAttribute("is"),);
		b = d.insert(cv);
		if(b == false)
		{
			response.sendRedirect("success.jsp");
		}
		else{
			response.sendRedirect("error.jsp");
		}
		break;
	case "papu":

		String fname =	request.getParameter("fname");
		long number = Long.parseLong(request.getParameter("number"));
		
	    Date bdate = jx.parse(request.getParameter("bdate"));
		
	    
	    
		String gender =	request.getParameter("gender");
		byte cid =	Byte.parseByte(request.getParameter("cid"));
		String address =	request.getParameter("address");
		String[] hob =	request.getParameterValues("hob");
	    
		String hj = hob[0];
		for (int i = 1; i < hob.length; i++) {
			hj = hj + "," + hob[i];
		}
		
		userModel m = new userModel(fname, number,bdate,gender,cid,address,hj);

		b = d.insert(m);

		if(b)
		{
			response.sendRedirect("success.jsp");
		}
		else{
			response.sendRedirect("error.jsp");
		}
	
		break;
	case "mummy":

		 fname =	request.getParameter("fname");
		 number = Long.parseLong(request.getParameter("number"));
		 gender =	request.getParameter("gender");
		 cid = Byte.parseByte(request.getParameter("cid"));
		 address =	request.getParameter("address");
		 hob =	request.getParameterValues("hob");
		 bdate = jx.parse(request.getParameter("bdate"));
		 for (int i = 0; i < hob.length; i++) {
		

		 m = new userModel(fname, number,bdate,gender,cid,address,hob[i]);

			 d.insert(m);
		 } 
		 
			response.sendRedirect("success.jsp");
			 
		break;
	case "bhai":

		 fname =	request.getParameter("fname");
		 number = Long.parseLong(request.getParameter("number"));
		 gender =	request.getParameter("gender");
		String country =	request.getParameter("country");
		 address =	request.getParameter("address");
		 hob =	request.getParameterValues("hob");
		
		 masterModel mn = new masterModel(fname, number, gender, country, address);
		 b = d.insert(mn);
		 if(b)
		 {
			int ij = d.getId();
			 for (int i = 0; i < hob.length; i++) {
				 childModel	 mo = new childModel(ij,hob[i]);
           		 d.insert(mo);
				 } 
				response.sendRedirect("success.jsp");
							 			 
		 }
		 else{
			 response.sendRedirect("error.jsp");
		 }
     		 
		break;
	case "bapuji":

		 fname =	request.getParameter("fname");
		 number = Long.parseLong(request.getParameter("mobile"));
		String email =	request.getParameter("email");
		
		firstModel fc = new firstModel(fname);
		
	 b = d.insert(fc);
	 if(b)
	 {
		int fid = d.getIds();
		 secondModle sc = new secondModle(fid, email);
		 b = d.insert(sc);
		 if(b)
		 {
			int sid = d.getIdd();

				thirdModel tc = new thirdModel(sid, number);
				b = d.insert(tc);
				 	 
		 }

		 else{
			 response.sendRedirect("error.jsp");
		 }	 	  
	 }
	 
			 
		break;

	default:
		break;
	}
}
catch (Exception e) {
	System.out.println(e);
    response.sendRedirect("error.jsp");
}
	}

}
