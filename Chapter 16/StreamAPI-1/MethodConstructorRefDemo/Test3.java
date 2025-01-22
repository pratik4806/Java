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
interface I3
{
    void m1(String a);
}
class A3
{
    public void m2(String a)
    {
        System.out.println("hello : "+a);
    }
}

public class Test3
{
    public static void main(String[] args)
    {
        A3 ob=new A3();
        I3 i=ob::m2;
        i.m1("deepak");
    }
}
