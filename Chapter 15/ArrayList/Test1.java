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
public class Test1
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();   //capacity - 10; size - 0
        
        al.add(0, 50);
        al.add(1, 90);
        al.add(20);
        al.add("deepak");
        al.add(3, "amit");
        
        System.out.println(al);
    }
}
