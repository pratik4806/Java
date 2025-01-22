/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethods;

import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
class A
{
    void show(ArrayList<?> al)
    {
        System.out.println(al);
    }
}
public class Test 
{
    public static void main(String[] args)
    {
        A ob1=new A();
        
        ArrayList<String> al=new ArrayList<String>();
        ob1.show(al);
        
        ArrayList<Integer> all=new ArrayList<Integer>();
        ob1.show(all);
    }
}
