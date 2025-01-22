/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstreamclassesdemo;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Deepak
 */
public class BufferedReaderDemo 
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr=new FileReader("D:\\student1.txt");
        BufferedReader bf=new BufferedReader(fr);
        
        int i;
        while( (i=bf.read()) != -1 )
        {
            System.out.print((char)i);
        }
        
        bf.close();
        fr.close();
    }
}
