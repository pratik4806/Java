/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Vector;

/**
 *
 * @author Deepak
 */
public class Test3 
{
    public static void main(String[] args)
    {
        Vector v=new Vector(8, 2);
        System.out.println(v.capacity());
        
        for(int i=0; i<13; i++)
        {
            v.addElement(i);
        }
        
        System.out.println(v);
        System.out.println(v.capacity());
    }
}
