//java package(lovely)
package com.maren.sonaliproject.controller;
//importing all the classes from the packages(lovely)
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherCtrl(Sonali054)
 */
@WebServlet("/DispatcherCtrl")
public class DispatcherCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(Sonali054)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ConfigCtrl is the url pattern of ConfigCtrl servlet(Sonali054)
		//getrequestdispatecher provides the facility of dispatching the request to another resource i.e. servlet,jsp or html(Sonali054)
		request.getRequestDispatcher("/ConfigCtrl").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(Sonali054)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
