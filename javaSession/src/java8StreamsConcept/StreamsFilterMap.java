package java8StreamsConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {

		List <Customer> custlist = Arrays.asList(new Customer("tom",20),
				new Customer("Simon",30),
				new Customer("bili",28),
				new Customer("Ross",30));
		
		List <String> list =custlist.stream()
		.filter(x ->"Ross".equals(x.getName()))
		.map(Customer::getName)
		.collect(Collectors.toList());
		
		list.forEach(lt->System.out.println(lt));
		
		
		//Mapping
		List <String> list1 = custlist.stream()
				.map(Customer::getName)
				.collect(Collectors.toList());
		
		list1.forEach(lt->System.out.println(lt));
		
		
		

	}

}
