package com.learningServlet;



import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)
    {
    	
		try {
			PrintWriter out = res.getWriter();
            int k=0;
            req.getCookies();
            Cookie cookies[]= req.getCookies();
            for(Cookie c:cookies)
            {
            	if(c.getName().equals("k"))
            		k=Integer.parseInt(c.getValue());
            }
            
			k=k*k;
			
			out.println("the sqaure of two no is: "+k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
