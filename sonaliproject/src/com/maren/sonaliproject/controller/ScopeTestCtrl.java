//java package(Sonali054)
package com.maren.sonaliproject.controller;
//importing all the classes from the packages(Sonali054)
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeTestCtrl(Sonali054)
 */
@WebServlet("/ScopeTestCtrl")
public class ScopeTestCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(Sonali054)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// to set a value
		request.setAttribute("REQUEST","Request Scope");
		//get session has access to doget and dopost method and set the value of session,request,application
		request.getSession().setAttribute("SESSION","Session Scope");
		request.getSession().setAttribute("SESSION","Session Scope");
		request.getSession().setAttribute("APP","Application Scope");
		//getrequestdispatecher provides the facility of dispatching the request to another resource i.e. servlet,jsp or html(Sonali054)
		request.getRequestDispatcher("/ScopeTest2").forward(request, response);;
		// returns a printwriter object that can send character text to the client here it is hello servlet(Sonali054)
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}

