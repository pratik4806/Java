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
    void m3();
}
public class Test3
{
    public static void main(String[] args) 
    {
        I3 i=() -> System.out.println("hi");
        i.m3();
    }
}
