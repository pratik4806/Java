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
public class DeleteFile 
{
    public static void main(String[] args) throws IOException
    {
        File f1=new File("D:\\SDLC\\abc.txt");
        
        if(f1.delete())
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
