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
@FunctionalInterface
interface I1
{
    void m1();
}
class A
{
    public void m2()
    {
        System.out.println("i am m1() method in class A");
    }
}

public class Test1
{
    public static void main(String[] args)
    {
        A ob=new A();
        I1 i=ob::m2;
        i.m1();
    }
}
