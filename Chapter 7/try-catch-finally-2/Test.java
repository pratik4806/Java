/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling3;

import java.io.FileInputStream;

/**
 *
 * @author Deepak
 */
public class Test 
{
    public static void main(String[] args)
    {
        FileInputStream fis=null;
        try
        {
            fis=new FileInputStream("");
            fis.read();
            System.out.println(100/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                fis.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
