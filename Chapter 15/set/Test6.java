/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsetdemo;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Deepak
 */
public class Test6
{
    public static void main(String[] args)
    {
        SortedSet ss=new TreeSet();
        
//        ss.add(10);
//        ss.add(30);
//        ss.add(80);
//        ss.add(60);
//        ss.add(20);
        
        ss.add("aaa");
        ss.add("ccc");
        ss.add("fff");
        ss.add("bbb");
        //ss.add(new StringBuffer("ddd"));
        
        System.out.println(ss);
    }
}
