/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstreamclassesdemo;

import java.io.CharArrayWriter;
import java.io.FileWriter;

/**
 *
 * @author Deepak
 */
public class CharArrayWriterDemo
{
    public static void main(String[] args) throws Exception
    {
        CharArrayWriter car=new CharArrayWriter();
        car.write("this is char array writer demo...!!");
        
        FileWriter fw1=new FileWriter("D:\\f1.txt");
        FileWriter fw2=new FileWriter("D:\\f2.txt");
        FileWriter fw3=new FileWriter("D:\\f3.txt");
        
        car.writeTo(fw1);
        car.writeTo(fw2);
        car.writeTo(fw3);
        
        fw1.close();
        fw2.close();
        fw3.close();
    }
}
