package javaBasics;

public class DataTypes {

	public static void main(String[] args) {
		// primitive data types - int, double,char,boolean
		
		/**
		 * ASCII Codes
		 * A = 65 a=97 difference : a-A = 32 also r-R = 32  => 'r' = 'a' + 17 → 97 + 17 = 114
		 * Numbers are also consecutive:  '0' = 48 '1' = 49.......'9' =57   **** '8' = '0' + 8 → 56
		 * 
		 */
		
		int i =10;
		int j =30;
		i = 40;  //duplicate variables not allowed but we can re-assigne the value to same variable
		System.out.println(i);
		
		char A = 'a'; // for char give single coat only otherwise it will consider in string and will give error
		char B = '2';
		char c = '$';
		char d = '0'; //only single characters are allowed not 100 , 12.0,aa etc
		System.out.println(c);
		
		
		boolean True = true ;
		boolean False = false;
		System.out.println(False);
		
		double a1= 10.56;
		/*In Java, a char is a 16-bit unsigned integer representing a Unicode code unit. 
		Java allows implicit widening conversions from char → int → double.
		The character 'r' has the Unicode (and ASCII) value:114 so it holds 114.0
		*/
		double a2 = 'r';
		double a3 = 100;
		double a4 = 0.00;
		System.out.println(a2);
		
		//string is not a data type its a class also not a primitive type
		String s1 = "abc"; 
		String s2 = "100";
		String s3 = "hello World";
		System.out.println(s3);
		
	}

}
