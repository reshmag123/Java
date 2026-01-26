package oopConcepts2;

//Concepts - Inheritance, Method Overriding ,Polymorphism
public class MethodOverriding {

	public static void main(String[] args) {
		
		//static or compile time polymorphism -one to many means method overriding - polymorphism
		BMW b = new BMW();
		
		b.start();
		b.stop();
		b.theifSafety();
		b.Engine();
		
		System.out.println("******************************************");
		
		Car c = new Car();
		c.stop();
		c.start();
		c.refuel();
		
		System.out.println("******************************************");
		
		
		//Child class object is referred by parent class variable is called dynamic polymorphism or run time polymorphism
		//also called top casting
		Car c1 = new BMW();
		c1.start();
		c1.refuel();
		//c1.theifSafety(); we can access methods of child class
		
		
		//this down casting in which we are referring parent class object by child class reference
		//variable which is not allowed
		//BMW b1 = new Car();
		//BMW b1 = (BMW) new Car();  //this gives ->  java.lang.ClassCastException
		
	}

}
