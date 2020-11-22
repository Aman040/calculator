package com.calculator;
import java.util.*;
public class Calculator {
	
	public double result(String s, double val1,double val2) {
		double res=0;
		switch(s) {
		case "+": res=val1+val2;
				break;
		case "-" : res=val1-val2;
				break;
		case "*" : res=val1*val2;
				break;
		case "/" : res=val1/val2;
				break;
		default : System.out.println("Wrong choice");
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator cal=new Calculator();
		
		
			System.out.println("Enter options \n + for add \n - for sub \n * for mul \n / for div");   
			String str=sc.nextLine();
			
			System.out.println("Enter two numbers");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			
			double answer=cal.result(str,a,b);
			System.out.println("Answer "+answer);
			sc.close();	
		
	}
	

}
