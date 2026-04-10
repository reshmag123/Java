package java_program_practice;

public class ReverseEachWordFromStringInSameOrder {

	public static void main(String[] args) {
		
		String str = "Java Practice Programs for Interview";
		String[] strArray = str.split(" ");
		
		
		for(String st : strArray)
		{
			StringBuilder sb = new StringBuilder(st);
			String Reveresed = sb.reverse().toString();
			System.out.print(Reveresed + " ");
		}
		
		

	}

}
