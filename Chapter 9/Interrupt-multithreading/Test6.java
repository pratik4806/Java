/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingdemo5;

/**
 *
 * @author Deepak
 */
class MyThread6 extends Thread
{
    public void run()
    {
        System.out.println("Is thread interrupted (1) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        
        //System.out.println("Is thread interrupted (1) : "+Thread.currentThread().isInterrupted());
        //System.out.println("Is thread interrupted (2) : "+Thread.currentThread().isInterrupted());
    }
}
public class Test6
{
    public static void main(String[] args)
    {
        MyThread6 mt=new MyThread6();
        mt.start();
        
        mt.interrupt();
    }
}