//java package(Sonali054)
package com.maren.sonaliproject.dao;
//importing all the classes from the packages(Sonali054)
import java.sql.Connection;
import java.lang.ClassNotFoundException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.maren.sonaliproject.model.Profile;
//class profiledao (sonali054)
public class ProfileDao {

	public static Connection getConnection()throws ClassNotFoundException,SQLException {
		//database mysql connection(Sonali054)
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3360/test", "root", "root");
	}
	//save is the method for class profile(Sonali054)
	public int save(Profile profile) {
		//connection and statement has been kept null(Sonali054)
		Connection con054 = null;
		Statement st054 = null;
		int res054 = 0;
		//exception handling(Sonali054)
		try {
			//getting connection with datadabse(Sonali054)
			con054 = getConnection();
			//creating statements(Sonali054)
			st054 = con054.createStatement();
			//executing queries(Sonali054)
			res054 = st054.executeUpdate("INSERT INTO test.student (userid, name, email, mobile) VALUES ('"+profile.getUserid()+"', '"+profile.getName()+"', '"+profile.getEmail()+"', "+profile.getMobile()+")"); 
		}catch (ClassNotFoundException | SQLException e) {
			//this method prints a stack trace for this throwable object on the standard error output stream(lovely)
			e.printStackTrace();
		}finally {
			try {
				st054.close();
				con054.close();
			} catch (SQLException e) {
	//this method prints a stack trace for this throwable object on the standard error output stream(lovely)
				e.printStackTrace();
			}
		}
		//terminates the execution of a function and return control to the calling function
		return res054;
	}
	//fetches all remaining row in the result set(Sonali054)
	public List<Profile> fetchAll() {
		//connection and statement has been kept null(Sonali054)
		List<Profile> list054=null;
		Connection con054 = null;
		Statement st054 = null;
		//exception handling(Sonali054)
		try {
			//getting connection with datadabse(Sonali054)
			con054 = getConnection();
			//creating statements(Sonali054)
			st054 = con054.createStatement();
			//executing queries(Sonali054)
			ResultSet rs054 = st054.executeQuery("SELECT * FROM test.profile");
			if(rs054 != null)
				//creating an array for the storage
				list054 = new ArrayList<>();
			while(rs054.next()) {
				////creating a new object profile166 of the class(Sonali054)
				Profile pr = new Profile();
				// the set method would set the value and get method will return the variable value(Sonali054)
				pr.setUserid(rs054.getString("userid"));
				pr.setName(rs054.getString("name"));
				pr.setEmail(rs054.getString("email"));
				pr.setMobile(rs054.getLong("mobile"));
				list054.add(pr);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st054.close();
				con054.close();
			} catch (SQLException e) {
//this method prints a stack trace for this throwable object on the standard error output stream(Sonali054)
				e.printStackTrace();
			}
			
		}
//terminates the execution of a function and return control to the calling function
		return list054;
	}
	//main function(Sonali054)
	public static void main(String[] args) {
		Connection con054 = null;
		Statement st054 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con054 = DriverManager.getConnection("jdbc:mysql://localhost:3360/test", "root", "root");
			st054 = con054.createStatement();
			ResultSet rs054 = st054.executeQuery("SELECT * FROM test.student");
			while(rs054.next()) {
				String id = rs054.getString("userid");
				String name = rs054.getString("name");
				String email = rs054.getString("email");
				long mobile = rs054.getLong("mobile");
				System.out.println("Id : " +id + "\tName : "+ name+ "\tEmail : " +email + "\tMobile : " +mobile );
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st054.close();
				con054.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
