//java package(Sonali054)
package com.maren.sonaliproject.controller;
//importing all the classes from the packages(Sonali054)
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.sonaliproject.dao.ProfileDao;
import com.maren.sonaliproject.model.Profile;


@WebServlet("/ProfileSaveCtrl")     
public class ProfileSaveCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(Sonali054)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//creating a new object profile054 of the class(Sonali054)
		Profile profile054 = new Profile();
		// the set method would set the value and get method will return the variable value(Sonali054)
		profile054.setUserid(request.getParameter("userid"));
		profile054.setName(request.getParameter("name"));
		profile054.setEmail(request.getParameter("email"));
		//here long class is use parse the charsequence argument as a signed long with specified radix(Sonali054)
		profile054.setMobile(Long.parseLong(request.getParameter("mobile")));
		// save in database
		int res = new ProfileDao().save(profile054);
		//to set the attribute
		request.setAttribute("RES", res);
		//getrequestdispatecher provides the facility of dispatching the request to another resource i.e. servlet,jsp or html(Sonali054)
		request.getRequestDispatcher("/ProfileViewCtrl").forward(request, response);
	}

}
