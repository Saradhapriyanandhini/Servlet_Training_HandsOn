package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home1 extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException, IOException{
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String user1=req.getParameter("name");
		String pas1=req.getParameter("password");
		
		pw.println("Name"+user1);
		pw.println("Password"+pas1);
	}
	

}

