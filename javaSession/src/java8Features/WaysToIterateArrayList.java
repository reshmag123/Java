package java8Features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class WaysToIterateArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> arrayString = new ArrayList<String>();
		arrayString.add("Running");
		arrayString.add("Walking");
		arrayString.add("Talking");
		arrayString.add("Playing");
		
		System.out.println("*******************Iterate using for Each and lambda expression(consumer)***************");
		arrayString.forEach(act -> System.out.println(act));
		
		
		
		System.out.println("*******************Iterate using for Each***************");
		for(String st : arrayString)
		{
			System.out.println(st);
		}
		
			
		System.out.println("*******************Iterate using for Each Remaining***************");
		Iterator<String> it = arrayString.iterator();
		it.forEachRemaining(acts -> System.out.println(acts));
		
		
		
		System.out.println("*******************Iterate using Iterator***************");
		it = arrayString.iterator();
		while(it.hasNext())
		{
			String act1 = it.next();
			System.out.println(act1);
		}
		
		
		
		System.out.println("*******************Iterate using ListIterator In reverse order***************");
		ListIterator<String> list = arrayString.listIterator(arrayString.size());
		while(list.hasPrevious())
		{
			String act2 = list.previous();
			System.out.println(act2);
		}
		
		
		
		System.out.println("*******************Iterate using For loop***************");
		for(int i =0 ; i<arrayString.size();i++)
		{
			System.out.println(arrayString.get(i));
		}
		
		
		System.out.println("*******************method Refrences***************");
		arrayString.forEach(System.out::println); //forEach uses the consumer

	}

}
