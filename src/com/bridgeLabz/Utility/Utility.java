package com.bridgeLabz.Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Utility {

	Scanner scanner =new Scanner(System.in); 
	BufferedReader br;
	
	public Utility(){
		br=new BufferedReader(new InputStreamReader(System.in));	
	}
	/**
	 * @return input a word
	 */
	public String inputString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return "";
	}
	public int inputInteger(){
		try{
			try {
				return Integer.parseInt(br.readLine());
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
		}catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return 0;
	}
	
	public double inputDouble() {
		try {
			try {
				return Double.parseDouble(br.readLine());
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return 0.0;
	}
	

	/*LEAP YEAR*/
	public void leapYear(int year){
		if((year%400==0)||((year%4==0)&&(year%100!=0)))
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
	}
	/*TOSS COIN*/
	public void tossCoin(int num){
		int hcnt=0;
		int tcnt=0;
		for(int i=1;i<=num;i++){
			coin();
			if(getSideup().equals("heads")){
			   hcnt++;
			}
			else{
			   tcnt++;
			}
		}
		System.out.println("total heads "+hcnt+" and total tails "+tcnt);
	}
	public String sides;
	public void coin(){
		Random rand=new Random();
		int sideup = rand.nextInt(2);
		if(sideup==0){
		   sides="heads";
		}
		else{
		   sides="tails";
		}
	}
	public String getSideup(){
		System.out.println(sides);
		return sides;
	}
	public void powerOfTwo(int num){
		int[] a=new int[num];
		for(int i=0;i<num;i++){
			a[i]=(int)Math.pow(2,i);
			System.out.println(a[i]);
		}
	}
	
    /*HARMONIC NUMBER*/
	public void harmonicNum(double num){
        double res=0;
		
		double i;
		for(i=1;i<=num;i++){
		    res=(res+(1/i));
		}
		System.out.println("The result will be :"+res);
	}
	/*PRIME FACTORIAL*/
	public void prime(int num){
		for(int i=1;i<=num;i++){
			if(num%i==0){
			   boolean a= checkPrime(i);
				if(a)
				   System.out.println(i+" is a primefactorial number");
			}
		}
	}
	public boolean checkPrime(int x){
		int count=0;
		for(int i=1;i<=x;i++){
			if(x%i==0)
			   count++;
		}
		if(count==2)
		    return true;
		return false;
	}
	/*ARRAY 2D*/
	public void array2D(int row,int col,int choice){
		switch(choice){
        case 1:
             System.out.println("INTEGER");
             int a[][]=integer2D(row,col);
             displayInt(a);
             break;
        case 2:
             System.out.println("DOUBLE");
             double b[][]=double2D(row,col);
             displayDouble(b);
             break;
        case 3:
             System.out.println("BOOLEAN");
             boolean c[][]=boolean2D(row,col);
             displayBoolean(c);
             break;
        default:
             System.out.println("Invalid Choices");
    }
	}
	public int[][] integer2D(int m,int n){
		int[][] data = new int[m][n];
        for(int row=0;row<m;row++){
        	for(int col=0;col<n;col++){
        		System.out.println("Enter elements :");
        		data[row][col] = inputInteger();
        		
        	}
        }
        return data;
	}
	public void displayInt(int a[][]){
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a.length;col++)
			{
				System.out.print(a[row][col]);
			}
			System.out.println();
		}

	}
	public double[][] double2D(int m,int n){
		double[][] data = new double[m][n];
        for(int row=0;row<m;row++){
        	for(int col=0;col<n;col++){
        		System.out.println("Enter elements :");
        		data[row][col] = inputDouble();
        		
        	}
        }
        return data;
	}
	public void displayDouble(double a[][]){
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a.length;col++)
			{
				System.out.print(a[row][col]);
			}
			System.out.println();
		}

	}
	public boolean[][] boolean2D(int m,int n){
		boolean[][] data = new boolean[m][n];
        for(int row=0;row<m;row++){
        	for(int col=0;col<n;col++){
        		System.out.println("Enter elements :");
        		data[row][col] = scanner.nextBoolean();
        		
        	}
        }
        return data;
	}
	public void displayBoolean(boolean a[][]){
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a.length;col++)
			{
				System.out.print(a[row][col]);
			}
			System.out.println();
		}

	}
	/*SUM OF INTEGERS*/
	public void sumOfInteger(int a[]){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				for(int k=0;k<a.length;k++){
					if(a[i]+a[j]+a[k]==0){
					   System.out.println(a[i]+","+a[j]+","+a[k]+" are of distinct triplets");
					}
				}
			}
		}
	}
	/*DISTANCE*/
	public void distance(int x,int y){
		double res=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		System.out.println("The euclidean distance is :"+res);
	}
	/*STOP WATCH*/
	private long starttime=0;
	private long endtime=0;
	private boolean running=false;

	public void startTime(){
		this.starttime=System.currentTimeMillis();
		this.running=true;
	}

	public void endTime(){
		this.endtime=System.currentTimeMillis();
		this.running=false;
	}
	public long getElapsedTime(){
		long elapsed;
		    if (running) {
		         elapsed = (System.currentTimeMillis() - starttime);
		    }
		    else {
		        elapsed = (endtime - starttime);
		    }
		    return elapsed;
	}
	/*STRING PERMUTATION*/
	public  void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] ch = a.toCharArray();
        temp = ch[i] ;
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
    /*QUADRATIC*/
    public void quadratic(int a,int b,int c){
    	int delta = b*b - 4*a*c;
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		double x2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("Root 1 of x : "+x1);
		System.out.println("Root 2 of x : "+x2);
	
    }
    /*WINDCHILL*/
    public void windChill(double t,double v){
    	double w=0;
    	if(t<50 && v<120 && v>3)
    		w= 35.74 + (0.6215*t) + (((0.4275*t)-35.75) * Math.pow(v,0.16));
    		System.out.println("The value of windchill is : "+w);
    }
}
