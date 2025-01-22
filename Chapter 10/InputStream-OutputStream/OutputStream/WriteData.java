/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputstreamdemo;

import java.io.FileOutputStream;

/**
 *
 * @author Deepak
 */
public class WriteData
{
    public static void main(String[] args)
    {
        try
        {
            String data="this is my first demo...!!";
            
            FileOutputStream fos=new FileOutputStream("D:\\student1.txt");
            byte[] b=data.getBytes();
            fos.write(b);
            fos.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
