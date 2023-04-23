package com.velocity;

public class J {
	// find the duplicate from given array

	public static void main(String[] args) {
		int a[] = { 33,44,33,55,44,66,77,88,99};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j<a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println("duplicate element is>>"+ a[i]);
					
				}
			}
			
		}

	}

}
