package com.bridgeLabz.Programs;

import com.bridgeLabz.Utility.Utility;

class ReplaceWord{

public static void main(String[] args){
	
	Utility utility=new Utility();
	String st1="Hello <<UserName>>, How are you?";
	System.out.println("Enter your appropriate user name ");
	String st2 = utility.inputString();
	System.out.println(st1.replaceAll("<<UserName>>", st2));
	}
}
