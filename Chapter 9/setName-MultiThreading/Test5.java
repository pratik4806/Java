/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingdemo3;

/**
 *
 * @author Deepak
 */
class MyThread5 extends Thread
{
    public void run()
    {
        System.out.println("hi");
        System.out.println("Child thread : "+Thread.currentThread().isDaemon());
    }
}
public class Test5
{
    public static void main(String[] args)
    {
        //Thread.currentThread().setDaemon(true);
        
        MyThread5 mt5=new MyThread5();
        mt5.setDaemon(true);
        mt5.start();
        //mt5.setDaemon(true);
        
        System.out.println("Main thread : "+Thread.currentThread().isDaemon());
    }
}
