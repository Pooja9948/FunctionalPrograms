package com.bridgeLabz.Programs;

import com.bridgeLabz.Utility.Utility;

class Stopwatch{

    public static void main(String[] args){
		Utility utility=new Utility();
		Stopwatch s=new Stopwatch();
		utility.startTime();
		//currentTimeMillis().......code  time waste for getting elapsed time
		//..............
		//............
		//............
		utility.endTime();
		System.out.println("The elapsed time is :"+utility.getElapsedTime());
	}
}
