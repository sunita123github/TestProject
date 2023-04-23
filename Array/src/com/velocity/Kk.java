package com.velocity;

public class Kk {
	// find the largest and smallest number from given array

	public static void main(String[] args) {
		
		int a[] = {33,44,23,45,67,80,23,45,67,34,12};
		int min = a[0];
		int max = a[0];
		 
		for (int i = 0; i<a.length; i++) {
			if (a[i]<min) {
				min = a[i];
				
			}else
				
			if (a[i]>max) {
			   max = a[i];
					
				}
		}
		System.out.println("smallest number is>>"+ min + " " + "largest number is >>" +max);
		

	}

}
