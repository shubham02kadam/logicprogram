package com.SwappnigNo;

public class Test {

	public static void main(String[] args) {
     
		int a=10;
		int b=20;
		
		System.out.println("Before Swapping value are:"+a+" "+b);
		
		
		//using first logic= Third variable
		
		/*
		 * int t=a; a=b; b=t;
		 */
		
		//logic2 = using + & - operator do not use Third variable
		
		
		a=a+b; //a=10+20=30
		
		b=a-b;// b=30-20=10
		
		a=a-b;// a=30-10=20
		
		
		
		
		System.out.println("After Swapping value are:"+a+" "+b);
		
		
		
	}

}
