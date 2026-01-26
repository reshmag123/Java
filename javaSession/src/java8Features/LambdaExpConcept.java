package java8Features;

public class LambdaExpConcept {

	public static void main(String[] args) {
		// 
		
		WebPage w1 = (name)->{System.out.println(name);};
		WebPage w2 = (value)->{System.out.println(value.length());};
		WebPage w3 = (text)->{System.out.println(text.toUpperCase());};
		
		
		w1.header("Hello");
		w2.header("Engineering");
		w3.header("yolo");

	}

}
