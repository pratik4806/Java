/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstreamclassesdemo;

import java.io.CharArrayReader;

/**
 *
 * @author Deepak
 */
public class CharArrayReaderDemo
{
    public static void main(String[] args) throws Exception
    {
        char[] ch={'a', 'b', 'c', 'd', 'e', 'f'};
        CharArrayReader car=new CharArrayReader(ch);
        
        int i;
        while( (i=car.read()) != -1 )
        {
            System.out.print((char)i);
        }
        
        car.close();
    }
}
