package com.learningServlet;



import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)
    {
    	
		try {
			PrintWriter out = res.getWriter();
			int k= Integer.parseInt(req.getParameter("k")) ;
			k=k*k;
			
			out.println("the sqaure of two no is: "+k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
