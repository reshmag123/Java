package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		/*
		 * Array size is fixed
		 * we can store similar data type values in array
		 * one dim array
		 * 
		 * Disadvantage:
		 * Size is fixed (static array) -> to overcome this we can used collection - Array List, HashMap, HashTble (dynamic array)etc
		 * can store Similar data type values -> to overcome this we can use object array
		*/
		
		System.out.println("********************Int type Array**********************");

		
        int i[] = new int[4];
        i[0] = 23;
        i[1] = 24;
        i[2] = 25;
        i[3] = 26;
        
        System.out.println(i[1]);
        System.out.println(i.length+ "\n");
       // System.out.println(i[4]);   //gives ArrayOutOfBoundException
        
       for(int j=0;j<i.length;j++)
       {
           System.out.println(i[j]);

       }
       
       
       System.out.println("********************Double type Array**********************");

       
       double d[] = new double [4];
       d[0] = 12.66;
       d[1] = 34.87;
       d[2] = 60;
       d[3] = 'a';
       
       for(int j=0;j<d.length;j++)
       {
           System.out.println(d[j]);

       }
       
       
       System.out.println("********************Character type Array**********************");
       
       char c[] = new char[3];
       c[0] = 'a';
       c[1] = 'b';
       c[2] = 'c';
       
       for(int j=0;j<c.length;j++)
       {
           System.out.println(c[j]);

       }
       
       
       System.out.println("********************Boolean type Array**********************");
       //when we don't assign any value then by default it will take false e.g here b[2] is false this only for boolean
       
       boolean b[] = new boolean[3];
       b[0] = true;
       b[1] = false;
       
       
       for(int j=0;j<b.length;j++)
       {
           System.out.println(b[j]);

       }
       
       
       System.out.println("********************String type Array**********************");
       
       String s[] = new String[3];
       s[0] = "Hello";
       s[1] = "world$";
       s[2] = "100";
       
       for(int j=0;j<s.length;j++)
       {
           System.out.println(s[j]);

       }
       
       
       System.out.println("********************Object type Array**********************");
       
       Object Ob [] = new Object[5];
       Ob[0] = 'a';
       Ob[1] = "hello";
       Ob[2] = 12.88;
       Ob[3] = 200;
       Ob[4] = false;
       
       for(int j=0;j<Ob.length;j++)
       {
           System.out.println(Ob[j]);

       }

       
	}

}
