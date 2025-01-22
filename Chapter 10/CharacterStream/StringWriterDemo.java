/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstreamclassesdemo;

import java.io.FileOutputStream;
import java.io.StringWriter;

/**
 *
 * @author Deepak
 */
public class StringWriterDemo 
{
    public static void main(String[] args) throws Exception
    {
        StringWriter sw=new StringWriter();
        sw.write("this is demo part");
        
        System.out.println(sw);
    }
}
