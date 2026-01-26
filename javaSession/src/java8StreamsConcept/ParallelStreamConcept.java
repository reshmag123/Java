package java8StreamsConcept;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

	public static void main(String[] args) {
		
		ForkJoinPool corepool = ForkJoinPool.commonPool();
		
		System.out.println(corepool.getParallelism());
		
		//Sequential stream
		System.out.println("-------------Sequential Stream--------");
		Stream.of("Hello","World","Run","Escape","Dance").forEach(System.out::println);
		
		System.out.println("-------------Parallel Stream----------");
		Stream.of("Hello","World","Run","Escape","Dance").parallel().forEach(System.out::println);//Random Execution
		
		
		
		System.out.println("-------------collection -parallelStream()----------");
		
		//Use parallelStream in case of collection
		Arrays.asList("Hello","World","Run","Escape","Dance").parallelStream().forEach(System.out::println);
		

		System.out.println("-------------Int Parallel Stream----------");
		
		IntStream.range(1, 11).parallel().forEach(System.out::println);
		
		
		System.out.println("-------------To check the stream is parallel or not----------");
		
		IntStream range = IntStream.range(1, 11);
		System.out.println(range.isParallel());
		
		IntStream range1 = IntStream.range(1, 11);
		range1.parallel();
		System.out.println(range1.isParallel());
	}

}
