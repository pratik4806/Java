/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo;

import java.util.Stack;

/**
 *
 * @author Deepak
 */
public class Test2 
{
    public static void main(String[] args)
    {
        Stack s=new Stack();
        
        s.push("aaa");
        s.push("bbb");
        s.push("ccc");
        s.push("ddd");
        
//        System.out.println(s.search("ccc"));
//        System.out.println(s.search("zzz"));
        
        System.out.println(s.empty());
        s.clear();
        System.out.println(s.empty());
    }
}
