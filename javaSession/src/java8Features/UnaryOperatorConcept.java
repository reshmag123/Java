package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorConcept {

	public static void main(String[] args) {
		// It extends the Function Interface
		
		UnaryOperator <Integer> uo = x -> x*8;
		System.out.println(uo.apply(40));
		
		
		List<String> langlist = new ArrayList<String>();
		langlist.add("Java");
		langlist.add("C");
		langlist.add("CPP");
		langlist.add("DSA");
		
		langlist.replaceAll(ele->ele + "class");
		System.out.println(langlist);

	}

}
