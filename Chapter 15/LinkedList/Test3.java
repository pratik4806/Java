/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.LinkedList;

/**
 *
 * @author Deepak
 */
public class Test3
{
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        
        ll.add("deepak");
        ll.add("rahul");
        ll.add("amit");
        ll.add("aaa");
        ll.add("bbb");
        
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        
        System.out.println(ll);
    }
}
