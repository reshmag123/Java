 package Collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// It is similar like HashMap but it is synchronised
		//value is store on the basis of key and value pair
		//Key is store in the form of object which has hashcode which stores the value - this is different from HashMap
		//HashCode is assign by JVM which is a 32 bit integer number to the class objects its kind off unique
		//we can not give null key and null values as it gives null pointer exception
		//Contain only unique values even if it contains the double same entry it will print only one entry as unique
		//If we need to increase the performance then we can't use hash table in multithreading as it is synchronised
		
		
		Hashtable h1 = new Hashtable();
		
		h1.put(1, "Java");
		h1.put(2, "C");
		h1.put(3, "CPP");
		h1.put(4, "SQL");
		h1.put(4, "SQL"); // it will print only one entry of sql because its contain unique values
		//h1.put(4, "csharp"); it will consider this as 4 is last assigned key 
		
		//h1.put(5,null);  this will give -> java.lang.NullPointerException
		
		Hashtable h2 = new Hashtable();

		h2 = (Hashtable)h1.clone();
		
		System.out.println("Hashcode of h2 is : "+h2.hashCode());  //Hashcode are same because we clone it 
		System.out.println("Hashcode of h1 is : "+h1.hashCode() +"\n");
		
		System.out.println("H1 hashtable : "+ h1);
		System.out.println("H2 hashtable : "+ h2);

		h1.clear(); // this will not clear the values from h2
		
		System.out.println("H1 hashtable : "+ h1);
		System.out.println("H2 hashtable : "+ h2);
		
		
		Hashtable <String,String> h = new Hashtable<String,String>();
		h.put("A", "Aniket");
		h.put("B", "Baby");
		h.put("C", "Cat");
		h.put("D", "Door");
		
		if(h.containsValue("Aniket"))
		{
			System.out.println("Value is found");
		}
		
		System.out.println("*******************************Print using Enumeration****************************");
		
		
		//print all the values from hastable using enumeration ---elements()
		
		Enumeration e = h.elements();
		System.out.println("Values from h hastable");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
		}
		
			
		
		System.out.println("*********************************Print using Entry Set ******************************");
		//Print all the values using Entry set
		
		for(Entry<String, String>e1 : h.entrySet())
		{
			String k = e1.getKey();
			String V = e1.getValue();
			System.out.println("keys are :"+k);
			System.out.println("values are :"+V +"\n\n");
		}
		
		
		System.out.println("Print values using entry set another method:" +"\n");
		
		Set s = h.entrySet();
		System.out.println("set values are :"+ s+"\n");
		
		
		
		System.out.println("*****************************To check the 2 hastables are equal or not******************************");
		
		Hashtable <String,String> hh = new Hashtable<String,String>();
		hh.put("A", "Aniket");
		hh.put("B", "Baby");
		hh.put("C", "Cat");
		hh.put("D", "Door");
		
		
		if(h.equals(hh))
			System.out.println("Both Hasntables are equal");
	}

}
