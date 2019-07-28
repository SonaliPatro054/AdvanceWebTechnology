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
 * Servlet implementation class ParametersCtrl(Sonali054)
 */
@WebServlet("/ParametersCtrl")
public class ParametersCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(Sonali054)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//retrieve request parameter (Sonali054)
		String name054=request.getParameter("txtName");
		String pass054=request.getParameter("pass");
		// returns a printwriter object that can send character text to the client(Sonali054)
		PrintWriter out=response.getWriter();
		//name and password would simply print(Sonali054)
		out.print("<b> Name <b>:"+name054);
		out.print("<b> Password <b>:"+pass054);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(Sonali054)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
