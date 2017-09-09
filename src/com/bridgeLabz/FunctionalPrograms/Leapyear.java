package com.bridgeLabz.FunctionalPrograms;

import java.util.Scanner;

import com.bridgeLabz.Utility.Utility;
class Leapyear{
	public static void main(String[] args){
		Utility utility=new Utility();
		
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=utility.inputInteger();
		utility.leapYear(year);
		
	}
}
