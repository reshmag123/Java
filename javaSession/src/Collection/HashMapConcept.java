package Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap is a class which implements Map Interface
		//It extends AbstractMap
		//It stores data in key value pair only 
		//It does not maintain any order
		//It may have one null key and multiple null values
		//It contain unique elements
		//Entry is used to traverse the HashMap
		//HashMap is Non Synchronized - not thread Safe - It is accessible to multiple processes at a time
		//Concurrent modification exception - Fail -Fast condition
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1,"Hello");
		hm.put(2,"World");
		hm.put(3,"Wonder");
		hm.put(4,"One");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(5));//This will not give exception - it gives null value
		
		System.out.println(hm.size());
		
		for(Entry<Integer,String> em : hm.entrySet())
		{
			System.out.println(em.getKey()+" "+em.getValue());
		}
		
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		System.out.println("*********************************Employee Example*****************************************");
		
		HashMap<Integer,Employee> hm1 = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Joe",26,1234);
		Employee e2 = new Employee("Tom",28,8976);
		Employee e3 = new Employee("Riya",25,2005);
		
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		
		for(Entry<Integer,Employee> it : hm1.entrySet())
		{
			int no = it.getKey();
			Employee emp = it.getValue();
			System.out.println(no + " Info" );
			System.out.println(emp.Name +" "+emp.age+" "+emp.Id);
		}

	}

}
