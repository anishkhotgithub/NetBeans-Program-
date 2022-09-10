package nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.util.List;
import static javafx.scene.input.KeyCode.T;

public class NIO 
{
    public void copy() throws Exception
    {
           Path p1=Paths.get("F:\\Byte\\a.txt.txt");
           Path p2=Paths.get("F:\\Byte\\b.txt.txt");
           Files.copy(p1,p2,StandardCopyOption.REPLACE_EXISTING);
           
    }
    public void move() throws Exception
    {
           Path p1=Paths.get("F:\\Byte\\a.txt.txt");
           Path p2=Paths.get("F:\\Byte2\\a.txt.txt");
           Files.move(p1,p2);
    }
    public void delete() throws IOException
    {
         Path p1=Paths.get("F:\\Byte2\\a.txt.txt");
         //Files.delete(p1);
         if(Files.deleteIfExists(p1))
         {
             System.out.println("Files Deleted");
         }
         else
         {
             System.err.println("File Not found!!");
         }
    }
      public void readLines() throws IOException
    {
        Path p1=Paths.get("F:\\html\\Bootstrap.html");
        List<String> lines=Files.readAllLines(p1);
        
        for (String line : lines) 
        {
            System.out.println(line);
        }
        
        System.out.println("\nLines: "+lines.size());
    }
    public void readFiles() throws IOException
    {
            Path p1=Paths.get("F:\\html");
            DirectoryStream<Path> files=Files.newDirectoryStream(p1,"*.html");
            for(Path file:files)
            {
                System.out.println(file.getFileName());
            }
    }
    
    public void readInfo() throws Exception
    {
        Path p1=Paths.get("F:\\html\\Bootstrap.html");
        DosFileAttributes obj=Files.readAttributes(p1, DosFileAttributes.class);
        System.out.println("Size:"+obj.size()+"bytes");
        System.out.println("Creation Time: "+obj.creationTime());
        System.out.println("Modification Time: "+obj.lastModifiedTime());
        System.out.println("Access Time: "+obj.lastAccessTime());
        System.out.println("Hidden: "+obj.isHidden());
        System.out.println("Readonly: "+obj.isReadOnly());
        System.out.println("System File: "+obj.isSystem());
    }
    public void PathDemo()
    {
            
        Path path=Paths.get("F:\\john\\foo\\a.txt");
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getNameCount());
        System.out.println(path.getRoot());
        System.out.println(path.getName(1));
        System.out.println(path.isAbsolute());
        System.out.println(path.toAbsolutePath());
        
        // .  -> current directory
        // .. -> parent directory
        
        Path p2=Paths.get("foo\\john");
        Path p3=Paths.get("jimmy\\a.txt");
        
        System.out.println(p2.relativize(p3));
        
        
        Path p4=Paths.get("jimmy\\foo\\..\\john");
        System.out.println(p4.normalize());
    }

    public static void main(String[] args) 
    {
             try
             {
                 NIO n=new NIO();
                 //n.copy();
                 //n.move();
                 //n.delete();
                 //n.readFiles();
                 //n.readLines();
                 //n.readInfo();
                 n.PathDemo();
             }
             catch(Exception e)
             {
                 System.out.println(e);
             }
    }
    
}
