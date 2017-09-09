package com.bridgeLabz.Programs;

import com.bridgeLabz.Utility.Utility;
class StringPermutation{
	public static void main(String[] args){
		Utility utility=new Utility();
        System.out.println("Enter a string");
        String string=utility.inputString();
        int n = string.length();
        utility.permute(string,0,n-1);
	}
	
}