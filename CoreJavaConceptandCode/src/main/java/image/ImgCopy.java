package image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ImgCopy {
public static void main(String[] args) throws IOException {
	InputStream is = null;
    OutputStream os = null;
    try {
        is = new FileInputStream(new File( "D:/study/spring/JavaGit/JavaAndSpring/image/source/download.jpg" ));
        System.out.println(is);
        System.out.println(os);
        os = new FileOutputStream(new File("D:/study/spring/JavaGit/JavaAndSpring/image/dest"));
        System.out.println("os 2" +os);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }
    } finally {
        is.close();
        os.close();
    }
}
}
