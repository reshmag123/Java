package oopConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading md = new MethodOverloading();
		md.sum();
		md.sum(12.78);
		md.sum(5, 10);
		//md.main(3);
	}
	
	//We can overload main method but not a good practice
	//No duplicate methods are allowed with same name and same arguments it should be different
	//we can not define a method inside another method
	
	public static void main(int x)
	{
		System.out.println("this is main method :"+ x);
	}
	
	public void sum()
	{
		System.out.println("this is sum method");
	}
	
	public void sum(int a,int b)
	{
		int c = a+b;
		System.out.println("Sum is :"+c);
		
	}
	
	public void sum(double d)
	{
		System.out.println("this is sum method with double value:"+d);
	}
	

}
