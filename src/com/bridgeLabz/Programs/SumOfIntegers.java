package com.bridgeLabz.Programs;

import com.bridgeLabz.Utility.Utility;

class SumOfIntegers
{
        public static void main(String[] args){
		Utility utility=new Utility();
		System.out.println("Enter the size");
		int n=utility.inputInteger();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
		  a[i]=utility.inputInteger();
		}
		utility.sumOfInteger(a);
		
	}
}
