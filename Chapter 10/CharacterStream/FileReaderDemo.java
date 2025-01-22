/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstreamclassesdemo;

import java.io.FileReader;

/**
 *
 * @author Deepak
 */
public class FileReaderDemo
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr=new FileReader("D:\\f1.txt");
        
        int i;
        while( (i=fr.read()) != -1 )
        {
            System.out.print((char)i);
        }
        
        fr.close();
    }
}
