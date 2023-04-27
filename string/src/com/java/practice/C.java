package com.java.practice;

public class C {
	
	//Write java program to reverse a string 
	//Input = hello
	//output= olleh		
			
	public static void main(String[] args) {
		String str = "123";
		//1st way 
		char[] chArr = str.toCharArray();	
		for(int i = chArr.length-1; i >= 0; i--) {
			System.out.print(chArr[i]);
			
		}
		
		System.out.println("");
		
		//2nd way
		for(int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println("");
		
		//3rd way
		StringBuffer sb = new StringBuffer(str);
		System.out.print(sb.reverse());
		
		System.out.println("");
		
		//4th way
		StringBuilder sbuilder = new StringBuilder(str);
		System.out.print(sbuilder.reverse());
		

	}

}
