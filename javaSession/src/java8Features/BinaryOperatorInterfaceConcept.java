package java8Features;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		// Binary operator extends Bifunction Interface
		
		BinaryOperator <Integer> bo = (x1,x2)->x1+x2;
		
		int i = bo.apply(20, 60);
		System.out.println(i);

		
		//BiFunction Interface -> only one abstract method _>apply()
		BiFunction<Integer,Integer,Integer> bi = (x1,x2)-> x1*x2;
		
		int result = bi.apply(20, 6);
		System.out.println(result);
	}

}
