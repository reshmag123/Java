package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingInputStream {

	public static void main(String[] args) {
        String path = "D:\\sample_with_Content.txt";
        FileInputStream fip = null;
		
		
		try
		{
			File file = new File(path);
			fip = new FileInputStream(file);
			
			int c = 0;
			while((c = fip.read()) != -1)
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
				fip.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
