package java_program_practice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		if(isPrime(22))
		{
			System.out.println("Number is prime");
		}else
		{
			System.out.println("Number is not a prime");
		}
	}
	
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}	
		for(int i=2 ; i<n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
