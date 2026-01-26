package oopConcepts;

public class StaticAndNonStaticConcept {
	
	//not static methods and variables can be called by using objects reference
	//no need to use object reference to call static methods and variables we can call it directly
	//we can call the static variable by calling object but it is not good practice
	//Scope of global variable is through out the program

	
	static int i = 30; //static global variable
	String name = "Java"; // Non static global variable

	public static void main(String[] args) {
		
		StaticAndNonStaticConcept sc = new StaticAndNonStaticConcept();
		
		//System.out.println(sc.i); 
		System.out.println(i);
		System.out.println(sc.name);
		sc.NonStatic();
		Mail();

	}
	
	public static void Mail()
	{
		System.out.println("this is static method");
	}
	
	public void NonStatic()
	{
		System.out.println("this is NonStatic method");
	}

}
