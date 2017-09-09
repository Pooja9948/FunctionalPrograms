package com.bridgeLabz.FunctionalPrograms;

import com.bridgeLabz.Utility.Utility;

class WindChill{

	public static void main(String[] args){
		Utility utility=new Utility();
		System.out.println("Enter the value of t");
		double t=utility.inputDouble();
		System.out.println("Enter the value of v");
		double v=utility.inputDouble();
		utility.windChill(t,v);
	
	}
}
