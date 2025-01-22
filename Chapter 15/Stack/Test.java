/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo;

/**
 *
 * @author Deepak
 */
public class Test
{
    void m1()
    {
        System.out.println("i am in m1 method");
        m3();
        System.out.println("m1");
    }
    
    void m2()
    {
        System.out.println("I am in m2 method");
        m1();
        System.out.println("m2");
    }
    
    void m3()
    {
        System.out.println("I am in m3 method");
        System.out.println("m3");
    }
    
    public static void main(String[] args)
    {
        Test t=new Test();
        t.m2();
    }
}
