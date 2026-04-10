package java_program_practice;

public class Palindrome {

	public static void main(String[] args) {
		
		String str1 = "madam";
		String str2 = "123345";
		
		StringBuilder sb = new StringBuilder(str1);
		String reverse1 = sb.reverse().toString();
		if(str1.equals(reverse1))
			System.out.println("palindrome it is " + reverse1);
			
		StringBuilder sb2 = new StringBuilder(str2);
		String reverse2 = sb2.reverse().toString();
		if(str2.equals(reverse2))
		{
			System.out.println("palindrome it is " + reverse2);
		}else
		{
			System.out.println("Not a palindrome :" + reverse2);
		}

	}

}
