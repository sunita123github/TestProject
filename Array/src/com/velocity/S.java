package com.velocity;

public class S {

	public static void main(String[] args) {
		int a [] = {10,20,30,40};
		int min = a[0];
		for (int i = 2; i< a.length; i++)
		{
			
			if (a[i]<min)
			{
				min = a[i];
			}
		
			}
		System.out.println("the maximum element is >>" + min);
	}

}
