/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class Test9
{
    public static void main(String[] args)
    {
        ArrayList al1=new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add("deepak");
        al1.add(20);
        
        //System.out.println(al1.get(2));
        
        //al1.set(1, 100);
        //System.out.println(al1);
        
        System.out.println(al1.lastIndexOf(200));
    }
}
