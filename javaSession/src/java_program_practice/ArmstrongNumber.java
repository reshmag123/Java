package java_program_practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt(); //8762
		int number = num;
		int a ;
		int arm =0 ;
		
	 String digits = String.valueOf(num);
	 int len = digits.length();
		
		while(num>0)
		{
			a = num%10;
			arm = arm + (int)Math.pow(a, len);
			num = num/10;
		}
		if(arm == number)
		{
		    System.out.println("armstrong number is :"+arm);
		}else
		{
			 System.out.println("Not a armstrong number");
		}
		
		sc.close();

	}

}
