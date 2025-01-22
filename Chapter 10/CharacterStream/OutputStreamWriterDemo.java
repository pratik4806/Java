/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstreamclassesdemo;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author Deepak
 */
public class OutputStreamWriterDemo 
{
    public static void main(String[] args) throws Exception
    {
        String str1="this is outputstreamwriter class demo..!!";
        char[] str2={'a','b','c','d','e'};
        
        FileOutputStream fos=new FileOutputStream("D:\\\\\\\\ffff.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        osw.write(str2);
        
        osw.close();
    }
}
