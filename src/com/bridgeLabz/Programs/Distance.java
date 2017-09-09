package com.bridgeLabz.Programs;

import com.bridgeLabz.Utility.Utility;

class Distance{
	public static void main(String[] args){
		Utility utility=new Utility();
		System.out.println("Enter X command line argument");
		int x=utility.inputInteger();
		System.out.println("Enter Y command line argument");
		int y=utility.inputInteger();
		utility.distance(x,y);
		
	}
}
