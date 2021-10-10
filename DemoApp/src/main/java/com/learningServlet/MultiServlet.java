package com.learningServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class MultiServlet extends HttpServlet
{
     public void doGet(HttpServletRequest req,HttpServletResponse res)
     {
    	 
		try {
			PrintWriter out = res.getWriter();
			int i= Integer.parseInt(req.getParameter("num1"));
			int j= Integer.parseInt(req.getParameter("num2"));
			int k= i+j;
            Cookie cookie = new Cookie("k", k+"");
            res.addCookie(cookie);
            res.sendRedirect("sq");
            
            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
     } 
}
