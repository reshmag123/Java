package oopConcepts;

public class CallByReferenceAndValue {

	int p ;
	int q ;
	
	public static void main(String[] args) {
		// some people say call by reference is not possible in java like c which uses pointers
		//But we can achieve call by reference in java too by passing object reference
		//In call by value we pass the copy of values so it will not change the original value 
		//In Call by reference if we change the value then it will change the original also
		
		CallByReferenceAndValue obj = new CallByReferenceAndValue();
		
		int x = 10;
		int y = 5;
		obj.sum(x,y); // call by value
		System.out.println(x + y); 
		
		obj.p = 20;
		obj.q = 30;
		
		obj.swap(obj);
		System.out.println(obj.p); 
		System.out.println(obj.q); 
		
		
	}
	
	public void sum(int a, int b)
	{
		a = 30;
		b = 40; // this will not change original vale of x and y 
		int c = a + b;
		System.out.println(c);
	}
	
	public void swap(CallByReferenceAndValue t) // passing the obj reference
	{
		int temp = t.p; // this will swap the original value as we are using the reference
		t.p = t.q ;
		t.q = temp;
		
	}

}
