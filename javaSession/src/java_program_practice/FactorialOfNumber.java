package java_program_practice;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int num = 8;
		int fact = 1;
		
		for(int i =1 ; i<=num; i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial is :"+ fact);

	}

}
