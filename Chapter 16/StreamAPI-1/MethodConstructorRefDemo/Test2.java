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
interface I2
{
    void m1();
}
class A2
{
    static void m2()
    {
        System.out.println("hiiii");
    }
}
public class Test2 
{
    public static void main(String[] args)
    {
        I2 i=A2::m2;
        i.m1();
    }
}
