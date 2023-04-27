package com.java.practice;

public class A {
    
	int id;
	String name;
	String place;
	double date;
	
	public A (int userid, String username, String userplace,  double userdate ) {
		
		id = userid;
		name = "username";
		place = "userplace";
		date = userdate;
		
		System.out.println("id >> " + userid);
		System.out.println("name >> " + username);
		System.out.println("place>>" + userplace);
		System.out.println("date>>" + userdate);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		A a = new A(123, "sunita", "dhule", 2.13);
	
		
		

	}

}
