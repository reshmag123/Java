package java8StreamsConcept;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {

	public static void main(String[] args) {
		
		//System.out.println(isPrime(7));
		//using sequential
		System.out.println("**********Using sequential************");
		long  t1 ,t2;
		t1 = System.currentTimeMillis();
		System.out.println(t1);
		
	long count = Stream.iterate(0,n -> n+1)
		.limit(10000)
		.filter(PrimeNumberWithParallelStream::isPrime)
		.peek(x -> System.out.println(x))
		.count();
	
	System.out.println("Count is :" +count);
	t2 = System.currentTimeMillis();
	System.out.println(t2);
	System.out.println("Total time taken: " + (t2-t1));
	
	
	
//	System.out.println("**********Using parallel************");
//	long  t3 ,t4;
//	t3 = System.currentTimeMillis();
//	System.out.println(t3);
//	
//	long count1 = Stream.iterate(0,n -> n+1)
//		.limit(10000)
//		.parallel()
//		.filter(PrimeNumberWithParallelStream::isPrime)
//		.peek(x -> System.out.println(x))
//		.count();
//	
//	System.out.println("Count is :" +count1);
//	t4 = System.currentTimeMillis();
//	System.out.println(t4);
//	System.out.println("Total time taken: " + (t4-t3));
	}
	
	public static boolean isPrime(int number)
	{
		if(number<=1)return false;
		
		return !IntStream.rangeClosed(2, number/2).anyMatch(x -> number%2 == 0);
	}

}
