package java_program_practice;

public class CompareEachWordFromTwoStrings {

	public static void main(String[] args) {
		
		 String s1 = "Java is fun and powerful";
	     String s2 = "Java is easy and useful language";
	     
	     String[] words1 = s1.split(" ");
	     String[] words2 = s2.split(" ");
	     
	     int maxLength = Math.max(words1.length, words2.length);
	     
	     for(int i =0 ; i< maxLength ; i++)
	     {
	    	 String w1 = (i < words1.length)? words1[i]:"No word";
	    	 String w2 = (i < words2.length)? words2[i]:"No word";
	    	 
	    	 if(w1.equalsIgnoreCase(w2))
	    	 {
	    		 System.out.println("word is match :"+ w1);
	    	 }
	    	 else
	    	 {
	    		 System.out.println("word is not match :"+ w1 +" vs "+w2);
	    	 }
	     }

	}

}
