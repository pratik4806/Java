/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Deepak
 */
public class Test1 
{
    public static void main(String[] args) throws FileNotFoundException, ArrayIndexOutOfBoundsException, ArithmeticException
    {
        FileInputStream fis=new FileInputStream("");
    }
    void m1()
    {
        throw new ArithmeticException();
    }
}
