package com.ayush.calculator;
import java.util.Scanner;

class Calculator{
	double a,b;
	public Calculator(double a,double b){
		this.a=a;
		this.b=b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	double subtract(double a,double b)
	{
		return a-b;
	}
	double multiply(double a,double b)
	{
		return a*b;
	}
	double divide(double a,double b)
	{
		return a/b;
	}
	
}
public class CalculatorTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		Calculator cal = new Calculator(a, b);
		System.out.println("Enter your choice 1.Add 2.Subtract 3.Multiply 4.Divide");
		int c = sc.nextInt();
		double result = 0;
		switch(c)
		{
		case 1: result = cal.add(a,b);
				break;
		case 2: result = cal.subtract(a,b);
				break;
		case 3: result = cal.multiply(a,b);
				break;
		case 4: result = cal.divide(a,b);
				break;
		default:System.out.println("Wrong choice");
		}	
		System.out.println("Result: " + result);
	}
}
