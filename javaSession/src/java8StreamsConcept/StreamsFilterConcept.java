package java8StreamsConcept;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterConcept {

	public static void main(String[] args) {
		
		List <Customer> custlist = Arrays.asList(new Customer("tom",20),
				new Customer("Simon",30),
				new Customer("bili",28),
				new Customer("Ross",30));
		
		Customer cust1 = custlist.stream()//convert to stream
		.filter(x -> "Ross1".equals(x.getName())) //filter for Ross
		.findAny() //If not find any result
		.orElse(null);// take null
		
		//System.out.println(cust1.getName()+" "+cust1.getAge());
		System.out.println(cust1); //if not equals then return null
		
		
		
		//For multiple Condition
		Customer cust2 = custlist.stream()//convert to stream
				.filter(x -> "Ross".equals(x.getName()) && 30 == x.getAge()) //filter for Ross
				.findAny() //If not find any result - java.lang.NullPointerException
				.orElse(null);// take null -
		
		System.out.println(cust2.getName()+" "+cust2.getAge());

	}

}
