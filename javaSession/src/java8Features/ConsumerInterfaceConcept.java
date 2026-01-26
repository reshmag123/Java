package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
		
		Consumer <String> str = x -> System.out.println(x);
		str.accept("Java 8 Session");
		
		List<String> stringList = Arrays.asList("java","jav","javaaa","hello","hell","j");
		stringList.forEach(x -> System.out.println(x));
		

	}

}
