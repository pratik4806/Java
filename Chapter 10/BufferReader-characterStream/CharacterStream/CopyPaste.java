/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copypaste;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Deepak
 */
public class CopyPaste 
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis=new FileInputStream("D:\\student1.txt");
            FileOutputStream fos=new FileOutputStream("D:\\student2.txt");
            
            int i;
            while( (i=fis.read()) != -1 )
            {
                System.out.print((char)i);
                fos.write(i);
            }
            
            fis.close();
            fos.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
