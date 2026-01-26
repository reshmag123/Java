package oopConcept4;

public abstract class Abstraction {
	
	//Abstract class contain some abstract methods and some others so there is no fully abstraction everytime
	//Can not create the object of abstract class
	//Final methods from abstract class can not be override
	//Interface contain 100% abstraction
	//We can create the constructor of Abstract class 
	//no need to create main method
	
	Abstraction(){
		System.out.println("Abstract class constructor");
	}
	
	public abstract void draw(); //abstract method
	
	public final void colour() {
		System.out.println("Final method from Abstract class");
	}
	
	public void shape() {
		System.out.println("shape");
	}

}
