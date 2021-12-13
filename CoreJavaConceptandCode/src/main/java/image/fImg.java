package image;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class fImg {
public static void main(String[] args) throws IOException {
	BufferedImage cp, img;
	System.out.println("main");
	 
    img = ImageIO.read(file); 
  
    	cp = deepCopy(img);
    	
    
}
private static final String path = "D:/study/spring/JavaGit/JavaAndSpring/image/source/download.jpg";
private static final File file = new File(path);

static BufferedImage deepCopy(BufferedImage bi) throws IOException {
	System.out.println("method");
	BufferedImage cImg = null;
	File saveImage =null;
	String a=null;
    String saveAs = "copy.jpg";
    
    ColorModel cm = bi.getColorModel();
    boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
    WritableRaster raster = bi.copyData(null);
     cImg = new BufferedImage(cm, raster, isAlphaPremultiplied, null);
    
    	 saveImage = new File("D:/study/spring/JavaGit/JavaAndSpring/image/dest/"+ saveAs);
   System.out.println("save " +saveImage);
    	//ImageIO.write(cImg, "jpg", saveImage);
    	System.out.println("Img  " + ImageIO.write(cImg, "jpg", saveImage));
    	for(int i =0;i<4;i++)
    	{
    		ImageIO.createImageOutputStream(saveImage);
    		System.out.println(ImageIO.createImageOutputStream("i " + saveImage));
    	}
    	
    return cImg;
}
}
