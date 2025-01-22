/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingcases;

/**
 *
 * @author Deepak
 */
class Abc2 extends Thread
{
    public void start()
    {
        System.out.println("hi");
    }
}
public class Test2
{
    public static void main(String[] args)
    {
        Abc2 ob1=new Abc2();
        ob1.start();
    }
}