package fileHandling;

import java.io.File;
import java.util.Arrays;

public class printFileNames {

	public static void main(String[] args) {
		
		String filepath = "D:\\";
		
		File file = new File(filepath);//creates a File object in memory,pointer/reference to a path, not the file itself.
		
		File FileNameList[] = file.listFiles();
		
		Arrays.sort(FileNameList);
		
		
		
		for(File f : FileNameList )
		{
			if(f.isFile())
			{
				System.out.println("File : "+f.getName() +" "+ f.getAbsolutePath());
				
			}else if(f.isDirectory())
			{
				System.out.println("Directory : "+f.getName() +" "+ f.getAbsolutePath());				
			}else
			{
				System.out.println("Not Known : "+f.getName() +" "+ f.getAbsolutePath());			}
		}
	}

}
