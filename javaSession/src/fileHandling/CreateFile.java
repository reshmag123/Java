package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		// Using File
		System.out.println("***************Using File********************");
		
		String path = "C:\\Users\\RJV3\\eclipse-java\\javaSession\\Sample.txt";
		
		File file = new File(path);
		try {
			boolean flag = file.createNewFile();
			if(flag)
			{
				System.out.println("File is created");
			}else
			{
				System.out.println("File is already created");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("***************FileOutputstream along with scanner********************");
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name with location path");
		String Name = sc.nextLine();
		
		FileOutputStream fos = new FileOutputStream(Name,true);
		System.out.println("Enter the file content");
		String content = sc.nextLine();
		
		byte b[]= content.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("file is saved on given location path");
		
		}catch(Exception e)
		{
			System.out.println("Some Exception is coming");
		}
	
		
		
		

	}

}
