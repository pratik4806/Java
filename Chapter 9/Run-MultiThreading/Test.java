/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingdemo1;

/**
 *
 * @author Deepak
 */
public class Test extends Thread
{
    @Override
    public void run()
    {
        System.out.println("hi");
    }
    public static void main(String[] args)
    {
        Test t=new Test();
        t.start();
    }
}