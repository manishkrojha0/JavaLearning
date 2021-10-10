package com.learningServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/add")

public class AddServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k= i+j;
		res.setContentType("text/html");
		
		PrintWriter out= res.getWriter();
		out.println("<html><body bgcolor='cyan'>");
		out.println("The Addition of Two No. is: "+k);
		out.println("</body></html>");
	   // System.out.println("The Addition of two no is: "+k);
	}


}