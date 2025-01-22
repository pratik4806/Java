/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 *
 * @author Deepak
 */
public class BufferedReaderDemo 
{
    public static void main(String[] args)
    {
        try
        {
//            InputStreamReader isr=new InputStreamReader(System.in);
//            BufferedReader br=new BufferedReader(isr);
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Name : ");
            //int i=br.read();
            String s=br.readLine();
            System.out.println(s);
            
            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
