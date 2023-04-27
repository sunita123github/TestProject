package com.entity;

public class C {
	int id;
	String name;
	String city;
	String country;
	
	public C(int userid, String username, String usercity , String usercountry ) {
		this.id = userid;
		this.name = username;
		this.city = usercity;
		this.country = usercountry;
		}
	public C (int userid ,String username) {
		this.id = userid;
		this.name = username;
		
	}
	

                
	@Override
	public String toString() {
		return "C [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + "]";
	}
	public static void main(String[] args) {
		
		C c = new C(12, "sunita","dhule", "india");
		C c1 = new C (13, "vicky", "none", "germaney");
		System.out.println(c);
		System.out.println(c1);
		
		
		
		

	}

}
