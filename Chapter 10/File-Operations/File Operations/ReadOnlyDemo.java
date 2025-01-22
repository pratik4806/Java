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
public class ReadOnlyDemo 
{
    public static void main(String[] args)
    {
        File f=new File("D:\\SDLC\\abc");
        
        if(f.setReadOnly())
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("fail");
        }
        
        System.out.println("------------------------------------");
        
        System.out.println("File can be read : "+f.canRead());
        System.out.println("File can be write : "+f.canWrite());
    }
}
