/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharStreamDemo;

import java.io.FileWriter;

/**
 *
 * @author Deepak
 */
public class WriteDemo
{
    public static void main(String[] args)
    {
        try
        {
            String data="this is my character stream demo....!!";
            FileWriter fw=new FileWriter("D:\\\\student1.txt");
            fw.write(data);
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
