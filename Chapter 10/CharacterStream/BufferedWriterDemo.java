/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstreamclassesdemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Deepak
 */
public class BufferedWriterDemo 
{
    public static void main(String[] args) throws Exception
    {
        FileWriter fw=new FileWriter("D:\\\\student1.txt");
        
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("this is deepak demo...!!");
        
        bw.close();
        fw.close();
    }
}
