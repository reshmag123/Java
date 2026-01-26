package java8StreamsConcept;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams {

	public static void main(String[] args) {
		
		
		Stream str =Stream.of("Iphone","Samsung","RealMe","Motorola","Nokia");//sequential stream
		//str.forEach(System.out::println);//once the stream is closed it cant be used again unless it gives java.lang.IllegalStateException
		str.findFirst()
		.ifPresent(System.out::println);
		
		
		System.out.println("******************************************************************");
		
		IntStream.range(1,11).forEach(System.out::println);
		
		
		System.out.println("******************************************************************");
		
		Arrays.asList(34,12,67,89,1,56)
		.stream()
		.findFirst()
		.ifPresent(System.out::println);
		
		
		System.out.println("******************************************************************");
		
		Stream.of("a1","a2","a3","a9") // string to Int
		.map(s -> s.substring(1))
		.mapToInt(Integer::parseInt)
		.max()
		.ifPresent(System.out::println);
		
		System.out.println("******************************************************************");
		
		//Doubles to string object
		Stream.of(12.0,13.1,14.2,15.3,16.4)
		.mapToInt(Double::intValue)
		.mapToObj(i -> "a"+i)
		.forEach(System.out::println);
		
		System.out.println("******************************************************************");
		
		//using limit
		Stream.iterate(0, N -> N+1).limit(6).forEach(System.out::println);
		
		
        System.out.println("******************************************************************");
		
		//print 10 odd numbers
		Stream.iterate(0, N -> N+1)
		.filter(x -> x%2 !=0)
		.limit(10)
		.forEach(System.out::println);
		
	}

}
