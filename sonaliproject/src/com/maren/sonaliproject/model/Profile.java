//java package(Sonali054)
package com.maren.sonaliproject.model;
//class profile(Sonali054)
    
public class Profile
 {
	//private access specifier so that it can be only accessed inside the same class(Sonali054)
	private String userid;

	private String name;

	private String email;

	private long mobile;
      	
	
	//deafault contsructor(Sonali054)
public Profile() {

	}
//copy constructor(Sonali054)
	public Profile(String userid, String name, String email, long mobile) {
//super keyword is the reference variable that is used to refer parent class objects(Sonali054)
		super();
//this keyword works as a refernce for the current object(Sonali054)
	this.userid = userid;

	this.name = name;
	
	this.email = email;

		this.mobile = mobile;
	
}
	//returns the value of variable userid(Sonali054)
	public String getUserid()
 {
		return userid;

	}
	//sets the value of userid(Sonali054)
	public void setUserid(String userid) {

		this.userid = userid;
	
	}
	//returns the value of variable name(Sonali054)
	public String getName() {
	
	return name;
	
	}
   //sets the value of name(Sonali054)
	public void setName(String name) {

		this.name = name;
	
}
    //returns the value of variable email(Sonali054)
	public String getEmail() {

	return email;

	}
    //sets the value of email(Sonali054)
	public void setEmail(String email) {

		this.email = email;
	}
	//return the value of variable mobile(Sonali054)
	public long getMobile() {
		return mobile;
	}
	//sets the value of variable mobile(Sonali054)
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
}

