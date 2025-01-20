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
public class Test2
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Test2 t2=new Test2();
        t2.m1();
    }
    void m1() throws FileNotFoundException
    {
        m2();
    }
    void m2() throws FileNotFoundException
    {
        FileInputStream fis=new FileInputStream("");
    }
}
