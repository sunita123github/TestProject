package com.velocity;

public class H {
	
	//java program to find duplicate element in array

	public static void main(String[] args) {
		int a [] = {10,20,30,10,40,50,40,60,50};
		
		for (int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate element is found>>" +a[i]);
					
				}
			}
		}

	}

}
