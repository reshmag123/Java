package java_program_practice;

public class ToReverseString {

	public static void main(String[] args) {
		
		String str = "Java Programming is easy ";
		
		StringBuilder sb = new StringBuilder(str);
		String reverseString = sb.reverse().toString();
		
		System.out.println("Reverse string is :"+reverseString);
	}

}
