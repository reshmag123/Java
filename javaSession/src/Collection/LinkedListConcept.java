package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		//singly LinkedList
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Java");
		ll.add("c");
		ll.add("cpp");
		//ll.addFirst("HTML");
		System.out.println(ll.size());
		ll.addFirst("sql");
		ll.addLast("javascript");
		ll.add("css");
		
		ll.removeFirst();
		//ll.removeLast();
		ll.remove(2);
		
		for(int i =0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("*****************************By Using For each************************");
		
		for(String str:ll)
		{
			System.out.println(str);

		}
		
		System.out.println("*****************************By Using Iterator************************");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			String text = it.next();
			System.out.println(text);
		}
		
		System.out.println("*****************************By Using While Loop************************");
		int num=0;
		while(num<ll.size())
		{
			System.out.println(ll.get(num));
			num++;
		}
	}

}
