package java8Features;

@FunctionalInterface
public interface WebPage {
	
	//SAM - Single abstract method
	//Functional Interface contain only one abstract method
	//Lambda expression can be used only if there is only one abstract method in case of functional interface
	//Functional Interface can have other static and default methods but single abstract method

	
	public void header(String name);
}
