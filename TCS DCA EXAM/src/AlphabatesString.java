import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;

public class AlphabatesString {

	public static void main(String[] args) throws IOException {
	System.out.println("Hello");
	File file = new File("D:/study/spring/JavaGit/img/download.jpg");
	System.out.println(file);
	for(int i =0;i<10;i++) {
		File dest = new File( i +".jpg");
		dest.createNewFile();
		Files.copy(file.toPath(), dest.toPath());
		
	}
	
	
		
	}

}
