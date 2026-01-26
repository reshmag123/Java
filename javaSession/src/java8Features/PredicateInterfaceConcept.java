package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		
		
		Predicate<Integer> pd = x -> x>5;
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> newList = list.stream().filter(pd).collect(Collectors.toList());
		System.out.println(newList);
		
		
		Predicate<String> str = x -> x.startsWith("jav");
		List<String> stringList = Arrays.asList("java","jav","javaaa","hello","hell","j");
		
		List<String> newStrList = stringList.stream().filter(str).collect(Collectors.toList());
		System.out.println(newStrList);
		
		
		List<String> strWithNegate = stringList.stream().filter(str.negate()).collect(Collectors.toList());
		System.out.println(strWithNegate);


	}
}
