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
public class GetSpaceInfo 
{
    public static void main(String[] args) throws IOException
    {
        File f1=new File("D:\\");
        
        long l=f1.getFreeSpace();
        System.out.println("Free space : "+l/(1024*1024*1024));
        
        long l2=f1.getTotalSpace();
        System.out.println("Total space : "+l2/(1024*1024*1024));
    }
}
