package oopConcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		
		//String to int wrapper class
		  String x = "100";
		  int i = Integer.parseInt(x);
		  System.out.println(i);
		  
		 //String to double
		  String y = "100.10";
		  Double j = Double.parseDouble(y);
		  System.out.println(j);
		  
		 //String to double
		  String z = "true";
		  boolean k = Boolean.parseBoolean(z);
		  System.out.println(k);
		  
		  
		  System.out.println("**********************************************************");
		  
		  
		  //Int to String 
		  
		  int a = 600;
		  String l = String.valueOf(a);
		  System.out.println(l+100);
		  
		  //double to string
		  double d= 6.66;
		  String m = String.valueOf(d);
		  System.out.println(m+100);
		  
		  //string to int when value is alphanumeric
		 // String s = "100A";
		 // int p = Integer.parseInt(s);  // java.lang.NumberFormatException:  as it is not complete integer
		 // System.out.println(p); 
		  
		 
	}

}
