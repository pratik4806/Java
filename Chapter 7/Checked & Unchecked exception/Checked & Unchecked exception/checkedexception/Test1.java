/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Deepak
 */
public class Test1 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fis=new FileInputStream("");
        fis.read();
    }
}
