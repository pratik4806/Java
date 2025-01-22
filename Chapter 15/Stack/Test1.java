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
public class Test1
{
    public static void main(String[] args)
    {
        Stack s=new Stack();
        
        s.push("aaa");
        s.push("bbb");
        s.push("ccc");
        s.push("ddd");
        
        System.out.println(s);
        //System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
    }
}
