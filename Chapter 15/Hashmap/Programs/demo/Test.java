/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Deepak
 */
public class Test 
{
    public static void main(String[] args)
    {
        Test t=new Test();
        System.out.println(t.hashCode());
        
        Test t2=new Test();
        System.out.println(t2.hashCode());
        
        Integer i1=new Integer(110);
        System.out.println(i1.hashCode());
        
        String str1=new String("amit");
        System.out.println(str1.hashCode());
    }
}
