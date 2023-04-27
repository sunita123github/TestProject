package com.entity;

public class A {
	int id ;
	String name;
	String city;
	String Address;
	
	
	public A(int userid , String username, String usercity , String userAdress ) {
		id = userid;
		name = "username" ;
		city = "usercity";
		Address = "userAdress";
		 System.out.println("id:"+userid);
		 System.out.println("name:"+username);
		 System.out.println("city:"+usercity);
		 System.out.println("Address:"+userAdress);
		 
		}

	public static void main(String[] args) {
		
		
		A a = new A(123, "sunita", "dhule", "colony");
		
		
		

	}

}
