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
    void m1();
    static void m2()
    {
        System.out.println("im static method");
    }
}
class A3 implements I3
{
    public void m1()
    {
        
    }
}
public class Test3
{
    public static void main(String[] args)
    {
        I3.m2();
    }
}
