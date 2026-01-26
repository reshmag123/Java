package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileUsingScanner {

	public static void main(String[] args) {
		
		String path = "D:\\sample_with_Content.txt";
		Scanner sc = null;
		
		
		try {
			
			File file = new File(path);
			sc = new Scanner(file);
			
		    while(sc.hasNextLine())
		    {
		    	System.out.print(sc.nextLine());
		    }
		}
		catch(Exception e)
		{
			System.out.println("Some exception is coming");
			
		}
		finally
		{
	      sc.close();	
		}
	}

}
