/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Deepak
 */
public class FileOperations
{
    public static void main(String[] args) throws IOException
    {
        File f=new File("D:\\SDLC\\abc");
        
        if(f.createNewFile())
        {
            System.out.println("file created successfully");
        }
        else
        {
            System.out.println("file not created due to some error");
        }
        
//        boolean b=f.createNewFile();
//        if(b)
//        {
//            System.out.println("file created successfully");
//        }
//        else
//        {
//            System.out.println("file not created sue to some error");
//        }
    }
}
