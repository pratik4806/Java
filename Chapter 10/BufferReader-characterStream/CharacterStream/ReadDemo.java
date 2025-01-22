/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharStreamDemo;

import java.io.FileReader;

/**
 *
 * @author Deepak
 */
public class ReadDemo
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr=new FileReader("D:\\student.txt");
            int i;
            while( (i=fr.read()) != -1)
            {
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
