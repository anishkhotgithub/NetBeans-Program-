
package bytedemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ByteDemo {


    public static void main(String[] args) 
    {
        byte[] arr=new byte[127];
        try {
            FileInputStream fis=new FileInputStream("E:\\Hello\\a.txt");
            FileOutputStream fos=new FileOutputStream("E:\\Hello\\b.txt");
            int r=0;
            while((r=fis.read(arr))!=-1)
            {
                fos.write(arr);
            }
            System.out.println("File copied successfully");
        } 
        catch (Exception e) {
        
            System.out.println(e);
        }
    }
    
}
