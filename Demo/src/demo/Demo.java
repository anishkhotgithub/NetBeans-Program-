/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author user
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         byte[] arr=new byte[127];
        try {
            FileInputStream fis=new FileInputStream("E:\\Hello\\Yes\\Hello.txt");
            FileOutputStream fos=new FileOutputStream("E:\\Hello\\Yes\\Hello1.txt");
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
