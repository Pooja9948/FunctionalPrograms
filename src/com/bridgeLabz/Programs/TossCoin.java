package com.bridgeLabz.Programs;

import com.bridgeLabz.Utility.Utility;

class TossCoin{

	public static void main(String[] args){
		Utility utility=new Utility();
		System.out.println("Enter the number of time toss the coin");
		int num=utility.inputInteger();
		utility.tossCoin(num);
		
	}
}
