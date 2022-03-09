package image;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.imageio.ImageIO;

import org.aspectj.util.FileUtil;
import org.springframework.util.FileSystemUtils;

public class FileCreation {
	public static void main(String[] args) {
		FileCreation f = new FileCreation();
		f.m1();
        //f.m2();
		//f.m3();
	}

	public void m1() {
		File source = new File("D:/study/spring/JavaGit/JavaAndSpring/image/source/download.jpg");

		for (int i = 1; i < 10; i++) { // where n is the no. of copies to make
			File dest = new File("D:/study/spring/JavaGit/JavaAndSpring/image/dest/" + i + ".jpg");
			try {
				dest.createNewFile();
				//Files.copy(source.toPath(), dest.toPath());
                //FileUtil.copyFile(source.toPath(), dest.toPath());
				FileSystemUtils.copyRecursively(source, dest);
			} catch (IOException ex) {
				System.out.println("Exception = " + ex);
			}
		}
	}

	public void m2() {
		try {

			File file = new File("D:/study/spring/JavaGit/JavaAndSpring/image/source/download");

			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void m3() {
		try {
			Image[] c = new Image[10];
			String fileLocation = "D:/study/spring/JavaGit/JavaAndSpring/image/source/download";
			for(int i=0;i<10;i++) {
		//	c[i]= new Image(getClass().getResource(fileLocation));
			//c[i]= ImageIO.read(getClass().getResource(fileLocation));
			c[i] = Image.class.newInstance();
			}
			}catch(Exception e){
			e.printStackTrace();
		}
	}

}
