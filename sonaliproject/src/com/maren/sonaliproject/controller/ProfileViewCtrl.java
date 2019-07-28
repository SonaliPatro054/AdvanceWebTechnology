//java package(Sonali054)
package com.maren.sonaliproject.controller;
//importing all the classes from the packages(Sonali054)
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.sonaliproject.dao.ProfileDao;
import com.maren.sonaliproject.model.Profile;
/**
 * Servlet implementation class ProfileViewCtrl(Sonali054)
 */
@WebServlet("/ProfileViewCtrl")
public class ProfileViewCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(Sonali054)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//reuqest to get a value(Sonali054)
		int res054 =  (int) request.getAttribute("RES");//added cast to int(Sonali054)
		PrintWriter out = response.getWriter();// returns a printwriter object that can send character text to the client(Sonali054)
		if (res054 == 0)//business logic
			//to output text to the console out.println prints the string and moves to next line(Sonali054)
			out.println("There is some problem ;  Try again .");
		else
			out.println("Data Successfully inserted");
		out.print(" <br/> The Datas are");
		//fetches all remaining row in the result set(Sonali054)
		List<Profile> list =  new ProfileDao().fetchAll();
		//iterator enables the programmer to traverse a container particularly lists(Sonali054)
		for (Iterator<Profile> iterator = list.iterator(); iterator.hasNext();) {
			Profile profile054 = (Profile) iterator.next();
			out.println("Name : "+ profile054.getName() +" Userid : "+ profile054.getUserid()+ "mobile "+ profile054.getMobile()+"email");
		}
		

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(Sonali054)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
