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
interface I1
{
    void m1();
    default void m2()
    {
        System.out.println("hi");
    }
}
class A implements I1
{
    public void m1()
    {
        
    }
    public void m2()
    {
        System.out.println("hello");
    }
}
public class Test1 
{
    
}
