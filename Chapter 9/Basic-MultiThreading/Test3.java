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
class Abc3 extends Thread
{
    public void run()
    {
        System.out.println("hi");
    }
}
public class Test3
{
    public static void main(String[] args)
    {
        Abc3 ob1=new Abc3();
        ob1.run();
    }
}