/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstreamclassesdemo;

import java.io.StringReader;

/**
 *
 * @author Deepak
 */
public class StringReaderDemo 
{
    public static void main(String[] args) throws Exception
    {
        StringReader sr=new StringReader("this is string reader demo");
        
        int i;
        while( (i=sr.read()) != -1) 
        {
            System.out.print((char)i);
        }
    }
}
