package fileHandling;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFileUsingDesktop {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\RJV3\\Downloads\\istqb_exam_sample_paper_1.pdf";
		
		File file = new File(path);
		
	    if(!Desktop.isDesktopSupported())
	    {
	    	System.out.println("Desktop is supported");
	    	return;
	    }
	    
	    Desktop desktop = Desktop.getDesktop();
	    if(file.exists())
	    {
	    	try {
				desktop.open(file);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	    }
	}

}
