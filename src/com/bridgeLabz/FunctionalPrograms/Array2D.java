package com.bridgeLabz.FunctionalPrograms;

import com.bridgeLabz.Utility.Utility;
class Array2D{
	
	public static void main(String[] args){
		Utility utility=new Utility();
        System.out.println("Enter m for 2D array");
        int row=utility.inputInteger();
        System.out.println("Enter n for 2D array");
        int col=utility.inputInteger();
        System.out.println("Enter x to choose the cases ");
        int choice=utility.inputInteger();
        utility.array2D(row,col,choice);
        
	}
	
}