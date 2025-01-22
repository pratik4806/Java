/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Deepak
 */
public class SearchFile3 
{
    public static void main(String[] args)
    {
        File f=new File("D:\\SDLC\\");
        
        String[] str=f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //return name.startsWith("M");
                return name.endsWith("java");
            }
        });
        
        for(int i=0; i<str.length; i++)
        {
            System.out.println(str[i]);
        }
    }
}
