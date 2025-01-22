/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstreamclassesdemo;

import java.io.FileWriter;

/**
 *
 * @author Deepak
 */
public class FileWriterDemo
{
    public static void main(String[] args) throws Exception
    {
        String str="this is demo......!!!!!";
        
        FileWriter fw=new FileWriter("D:\\demo.txt");
        fw.write(str);
        
        fw.close();
    }
}
