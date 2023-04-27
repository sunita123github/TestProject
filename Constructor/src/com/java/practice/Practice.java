package com.java.practice;

public class Practice {
	
    int id;
    String city;
    String Adrees;
    int date;
     
    public Practice (int userid, String usercity, String userAdrees, int userdate) {
    	
    	id = userid;
        city = usercity;
        Adrees = userAdrees;
        date = userdate;
        
        System.out.println("id >>" + userid);
        System.out.println("city>>" + usercity);
        System.out.println("Adrees>>" + userAdrees);
        System.out.println("date>>" + userdate);
        
        
    	
    }
	

	public static void main(String[] args) {
		
		Practice a = new Practice (2, "dhule" , "colony", 20 );
		
		

	}

}
