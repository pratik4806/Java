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
public class Test1
{
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        
        ll.add("deepak");
        ll.addLast("bbb");
        ll.add("rahul");
        //ll.addFirst("aaa");
        
        ll.add(3, "amit");
        
        System.out.println(ll);
    }
}
