package image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod;
  
public class FileMover
{
    public static void main( String[] args )
    {
        String path1 = "D:/study/spring/JavaGit/JavaAndSpring/image/source/";
        String filename = "download.jpg";
        String path2 = "D:/study/spring/JavaGit/JavaAndSpring/image/dest";
        File newFile=null;
        String newFile1=null;
        FileOutputStream fos=null;
        FileInputStream fis=null;
        
        File oldFile = new File( path1, filename );
        
        for(int i =0;i<10;i++) {
        	String s =Integer.toString(i);
        	newFile1 = s.concat(filename);
        	System.out.println(newFile1);  
        	 newFile = new File( path2, filename); 
        
        try
        {
        	fis = new FileInputStream( oldFile );
            fos = new FileOutputStream( newFile);
            try
            {
            		System.out.println("in");
                int currentByte = fis.read();
                while( currentByte != -1 )
                {
                   fos.write( currentByte );
                   currentByte = fis.read();
                }
            }
        
            catch( IOException exception )
            {
                System.err.println( "IOException occurred!" );
                exception.printStackTrace();
            }
            finally
            {
                fis.close();
                fos.close();
                System.out.println( "Copied file!" );
            }
        }
        catch( IOException exception )
        {
            System.err.println( "Problems with files!" );
            exception.printStackTrace();
        }
    }
    }
}


