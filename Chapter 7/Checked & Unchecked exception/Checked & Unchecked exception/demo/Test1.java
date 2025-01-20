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
public class Test1
{
    public static void main(String[] args)
    {
        Test1 t1=new Test1();
        t1.m1();
    }
    void m1()
    {
        divide();
    }
    void divide()
    {
        int a=100, b=0, c;
        c=a/b;
        System.out.println(c);
    }
}
