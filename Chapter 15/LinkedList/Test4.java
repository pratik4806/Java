/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Deepak
 */
public class Test4 
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add("deepak");
        al.add("rahul");
        al.add("amit");
        al.add("aaa");
        al.add("bbb");
        
        LinkedList ll=new LinkedList(al);
        ll.addFirst("ccc");
        
        System.out.println(ll);
    }
}
