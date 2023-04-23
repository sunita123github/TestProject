package com.velocity;

public class K {
	// w.p. find the largest and smallest number from given array

	public static void main(String[] args) {
		int a[] = {10,20,30,77,45,23};
		int max = a[0];
		int min = a[0];
		
		for (int i = 0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
				
			}else if(a[i]<min) {
				min = a[i];
				
			}
		}
		
		System.out.println("largest element is >>" + max + " "+ "smallest element is >>" + min);

	}

}
