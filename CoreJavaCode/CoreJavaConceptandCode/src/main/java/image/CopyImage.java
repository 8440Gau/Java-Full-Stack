package image;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CopyImage {
public static void main(String[] args) throws IOException {
	
copy1 c= new copy1();
for(int i=0;i<10;i++)
{
BufferedImage cp, img;

img = ImageIO.read(copy1.getFile()); 

	cp = copy1.deepCopy(img);
}

}


}
class copy1{
	 private static final String path = "D:/study/spring/JavaGit/JavaAndSpring/image/source/download.jpg";
	    private static final File file = new File(path);    
	    static String saveAs =null;
	    	static BufferedImage deepCopy(BufferedImage bi) throws IOException {
	    	  ColorModel cm = bi.getColorModel();
	    	  for(int i1=0;i1<10;i1++)
	    	  {
	    		   saveAs = "copy.jpg";  
	    		  System.out.println("pr");
	    	  }
	          	 
	        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
	        WritableRaster raster = bi.copyData(null);
	        BufferedImage cImg = new BufferedImage(cm, raster, isAlphaPremultiplied, null);
	        for(int i=0;i<10;i++) {
	        File saveImage = new File("D:/study/spring/JavaGit/JavaAndSpring/image/dest/", saveAs);   	 
	        	 ImageIO.write(cImg, "jpg", saveImage);
	        }
	        return cImg;
	    
	    }
	    		public static String getPath() {
			return path;
		}

		public static File getFile() {
			return file;
		}
	    }
	    
	    
	    
	    