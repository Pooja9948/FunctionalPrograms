package com.bridgeLabz.FunctionalPrograms;

import com.bridgeLabz.Utility.Utility;

class Quadratic{

	public static void main(String[] args){
		Utility utility=new Utility();
		System.out.println("Quadratic equation is a*x*x + b*x + c =0");
		System.out.println("Enter the value of a , b , c ");
		int a=utility.inputInteger();
		int b=utility.inputInteger();
		int c=utility.inputInteger();
		utility.quadratic(a,b,c);
		
	}
}
