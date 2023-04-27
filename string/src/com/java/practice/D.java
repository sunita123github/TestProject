package com.java.practice;

public class D {
	//w.j.p to remove all special characters from given string
	//input = $jav!va$&st%ar
	//ouput = javastar		

	public static void main(String[] args) {
		String str = "$jav!va$&st%ar";
		
		//1st way(replaceAll () method)
		String plainstr  = str.replaceAll("[$!&%0-9]","");
		System.out.println(plainstr);
	}

}
