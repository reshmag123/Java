package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		
		fileCopy();

	}//D:\
	
	//C:\Users\RJV3\Downloads
	
	public static void fileCopy()
	{
		File inputFile = new File("//C:\\Users\\RJV3\\Downloads\\istqb_exam_sample_paper_1.pdf");
		File outputFile = new File("//D:\\istqb_exam_sample_paper_1.pdf");
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		
		/*
		 * Use append only if you really want to add data, like:
			Logs
			Audit files
			Reports over time
			
			If we try to append same file then the size of file got increased on each execution but content remain same
	
		 */
		
		try {
			inputStream  = new FileInputStream(inputFile);
			outputStream = new FileOutputStream(outputFile);
			//outputStream = new FileOutputStream(outputFile , true);  -> to append the file at the end
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			System.out.println(inputStream.available()); //tells how many bytes can be read without blocking
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("*************************Read and Write the content************************");
		int i = 0;
		try {
			while((i = inputStream.read()) != -1)
			{
				outputStream.write(i);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		//System.out.println();  -  breaks the try–catch–finally chain so not to use anything between try-catch and finally
		
		finally
		{
			if(inputStream != null)
			{
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(outputStream != null)
			{
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
