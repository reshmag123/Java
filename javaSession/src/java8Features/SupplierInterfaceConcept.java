package java8Features;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		
		getText(() -> "Hello");
		getText(() -> "World");
		getText(() -> "Welcome");

	}
	
	public static void getText(Supplier<String>str)
	{
		System.out.println(str.get());
		System.out.println(str.get().length());
	}

	

}
