package com.bridgeLabz.FunctionalPrograms;

import com.bridgeLabz.Utility.Utility;  

class Harmonic{

	public static void main(String[] args){
		Utility utility=new Utility();
		
		System.out.println("Enter a number");
		double num=utility.inputDouble();
		utility.harmonicNum(num);
		
	}
}
