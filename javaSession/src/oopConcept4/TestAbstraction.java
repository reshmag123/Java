package oopConcept4;

public class TestAbstraction extends Abstraction{
	
	TestAbstraction(){
		System.out.println("Child class constructor");
	}
	

	public static void main(String[] args) {
		
		//We can create the parent reference variable referring the child class object
//		Abstraction ab = new TestAbstraction();
//		ab.draw();
//		ab.shape();
//		
		TestAbstraction tb = new TestAbstraction();
		tb.draw();
		tb.shape();
		
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing");
		
	}
	
	//This will give error when we try to override the final method from abstract class
	
//	public final void colour() {
//		System.out.println("Final method from Abstract class");
//	}

}
