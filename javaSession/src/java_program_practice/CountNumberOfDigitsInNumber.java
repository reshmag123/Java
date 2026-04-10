package java_program_practice;

import java.util.Scanner;

public class CountNumberOfDigitsInNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");	
		int num = sc.nextInt();
		
		//method - 1
		
		String digits = String.valueOf(num);
		System.out.println("number of digits are :"+ digits.length());
		
		//method -2 
		System.out.println("Enter Second Number");	
		int num1 = sc.nextInt();
		int count = 0;
		
		if(num1==0)
			count++;
		while(num1>0)
		{
			count++;
			num1= num1/10;
		}
		System.out.println("Number of digits using loop :"+count);
		
		sc.close();

	}

}
