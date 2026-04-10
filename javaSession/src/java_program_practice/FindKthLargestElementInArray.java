package java_program_practice;

import java.util.Arrays;

public class FindKthLargestElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,7,8,3,9,10,4,5,3};
	    int k = 1;
	    
	    Arrays.sort(arr);//convert array in ascending order
	   System.out.println("K largest element is :" + arr[arr.length - k]);
	}
	
	

}
