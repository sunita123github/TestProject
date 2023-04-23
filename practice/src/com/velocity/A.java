package com.velocity;

public class A {
	//String str="My name is Harshal";
	//output:Harshal is name My

	public static void main(String[] args) {
	String str = "my name is harshal";
	
	char [] charArr = str.toCharArray();
	for (int i = charArr.length-1; i >=0; i--) {
		System.out.print(charArr[i]);
	}

	}

}
