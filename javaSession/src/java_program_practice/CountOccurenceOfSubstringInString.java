package java_program_practice;

public class CountOccurenceOfSubstringInString {

	public static void main(String[] args) {
		
		String str = "abbccBBooccdCC";
		String lwr = str.toLowerCase();
		String str2 = "aaaaaabbaa";
		String pattern = "cc";
		String pattern2 = "aa";
		
		System.out.println(substringCount(str,pattern));
		System.out.println(substringCount(lwr,pattern));
		System.out.println(substringCount(str2,pattern2));
		

	}
	
	public static int substringCount(String str, String pat)
	{
		int count = 0;
		int index = 0;
		
		while((index=str.indexOf(pat, index)) != -1)
		{
			count++;
			index++;
		}
		
		return count;
	}

}
