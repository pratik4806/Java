/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstreamclassesdemo;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Deepak
 */
public class InputStreamReaderDemo
{
    public static void main(String[] args) throws Exception
    {        
        FileInputStream fis=new FileInputStream("D:\\f1.txt");
        InputStreamReader isr=new InputStreamReader(fis);
        
        int i;
        while( (i=isr.read()) != -1 )
        {
            System.out.print((char)i);
        }
        
        fis.close();
        isr.close();
    }
}
