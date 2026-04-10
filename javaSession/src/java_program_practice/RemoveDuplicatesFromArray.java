package java_program_practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int []arr = {1,5,6,2,8,1,7,3,4};
		
		Set<Integer>st = new HashSet<>();
		for(int num : arr)
		{
		  st.add(num);
		}
		
		System.out.println(st);

	}

}
