package fileHandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

	public static void main(String[] args) {
		
		String path = "D:\\sample_with_Content.txt";
		FileReader fr = null;
		
		
		try {
		    fr = new FileReader(path);
		    
		    int c =0;
		    while((c=fr.read()) != -1)
		    {
		    	System.out.print((char)c);
		    }
		}
		catch(Exception e)
		{
			System.out.println("Some exception is coming");
			
		}
		finally
		{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
