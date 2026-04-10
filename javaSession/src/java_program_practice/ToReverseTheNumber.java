package java_program_practice;

public class ToReverseTheNumber {

	public static void main(String[] args) {
		
		int num = 65432;
		int rev = 0;
		int r;
		System.out.println("number is :"+ num);
		while(num>0)
		{
			r = num%10; //to get the last digit
			rev = rev*10+r;
			num = num/10;		
		}
		
		System.out.println("Reversed is :" + rev);

	}

}
