/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.File;

/**
 *
 * @author Deepak
 */
public class CreateFolder
{
    public static void main(String[] args)
    {
        //File f=new File("E:\\javafiles\\aaa");
        
        // creating a folder.
        File f2=new File("D:\\SDLC\\Agile Model");
        
        if(f2.mkdirs())
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
