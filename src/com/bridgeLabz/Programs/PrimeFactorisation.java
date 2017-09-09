package com.bridgeLabz.Programs;

import com.bridgeLabz.Utility.Utility;

class PrimeFactorisation{

	public static void main(String[] args){
		Utility utility=new Utility();
		System.out.println("Enter a number");
		int num=utility.inputInteger();
		utility.prime(num);
		
	}

}
