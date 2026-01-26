package java8Features;

import java.util.function.Function;

public class FunctionInterfaceConcept {

	public static void main(String[] args) {
		// Function interface has one abstract method which is apply()
		//It accepts one type of input T and Type of output of function result
		
		
		Function<String,Integer> func = x-> x.length();
		
		int i = func.apply("Hello World");
        System.out.println("length is "+i);
        
		Function<Integer,Integer> func1 = x-> x*2;
		
		int num = func.andThen(func1).apply("I am learning java 8");
        System.out.println("Result is "+num);

        
        
	}

}
