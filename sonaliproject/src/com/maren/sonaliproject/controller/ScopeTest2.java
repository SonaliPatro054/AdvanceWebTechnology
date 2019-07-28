//java package(Sonali054)
package com.maren.sonaliproject.controller;
//importing all the classes from the packages(Sonali054)
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeTest2(Sonali054)
 */
@WebServlet("/ScopeTest2")
public class ScopeTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(Sonali054)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// sharing out data among resources(Sonali054)
		String req054=(String) request.getAttribute("REQUEST");//will process current request(Sonali054)
		String ses054=(String) request.getSession().getAttribute("SESSION");//will return current session(Sonali054)
		//http session contains a reference to servletcontext that this seesion belong to(Sonali054)
		String app054=(String) request.getServletContext().getAttribute("APP");
		// returns a printwriter object that can send character text to the client(Sonali054)
		PrintWriter out=response.getWriter();
		out.println("Req:"+req054);
		out.println("Session:"+ses054);
		out.println("Application:"+app054);
		
	}

}

