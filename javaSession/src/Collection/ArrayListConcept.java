package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//This is showing warning because it is not generic 
		//ArrayList is dynamic in size 
		//We can store duplicate values 
		//Insertion order is maintain
		//We can randomly access the values as its stored on the basis of index
		
		ArrayList ar = new ArrayList(); 
		
		ar.add(10);
		ar.add("Test");
		ar.add(12.88);
		ar.add('a');
		
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		
		//To print the values 
		for (int i =0 ; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		
     	System.out.println("***************************Generic ArrayList***************************");
		
		//Generic
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(13);
		ar1.add(41);
		ar1.add(63);
		ar1.add(30);
		ar1.add(53);
		
		for (int i =0 ; i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Test");
		ar2.add("Fail");
		
		System.out.println("***************************Employee object in ArrayList***************************\n");
		
		//ArrayList<E> ar3 = new ArrayList<E>(); //Employee type
        /*One can store employee class object in arraylist too*/
		
		Employee e1 = new Employee("Joe",26,1234);
		Employee e2 = new Employee("Tom",28,8976);
		Employee e3 = new Employee("Riya",25,2005);
		
		ArrayList <Employee> emp = new ArrayList <Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		System.out.println(emp.size());
		
		
		//As to print the values from Employee class object we need to use iterator as direct values are not present
		
		Iterator<Employee> Em = emp.iterator();
		while(Em.hasNext())
		{
			Employee e = Em.next();
			System.out.println(e.Name);
			System.out.println(e.age);
			System.out.println(e.Id +"\n");
		}
		
		
		System.out.println("***************************addAll ArrayList***************************");
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Test");
		ar5.add("Fail");
		ar5.add("Updated");
		ar5.add("Abort");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Test");
		ar6.add("Java");
		ar6.add("c");
		ar6.add("c++");
		
		ar5.addAll(ar6);
		
		System.out.println(ar5.size());

		for (int i=0 ; i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		
		
        ar5.removeAll(ar6); // common one and other arraylist element will remove
		
		System.out.println(ar5.size());
		for (int i=0 ; i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}


	}

}
