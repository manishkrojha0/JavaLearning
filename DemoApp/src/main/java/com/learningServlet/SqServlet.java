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
			out.println("the product of two no is: ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
