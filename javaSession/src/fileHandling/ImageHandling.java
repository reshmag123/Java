package fileHandling;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageHandling {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\RJV3\\eclipse-java\\javaSession\\Image";
		
		
		try {
//			URL url = new URL("https://share.google/Y4EiZZxToBinYVCNV");
			File file = new File("C:\\Users\\RJV3\\eclipse-java\\javaSession\\Image\\download.png");
			
			try {
				BufferedImage image;
				image = ImageIO.read(file);
		    	ImageIO.write(image, "jpg",new File("C:\\Users\\RJV3\\eclipse-java\\javaSession\\Image"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Done");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
