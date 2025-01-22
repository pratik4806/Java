/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingdemo4;

/**
 *
 * @author Deepak
 */
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("hi : "+Thread.currentThread().getName());
        System.out.println("Child thread priority : "+Thread.currentThread().getPriority());
    }
}
public class Test
{
    public static void main(String[] args)
    {
        MyThread mt=new MyThread();
        mt.start();
        
        //mt.setPriority(8);
        //System.out.println("Child thread priority : "+mt.getPriority());
        
        Thread.currentThread().setPriority(8);
        
        System.out.println("hello : "+Thread.currentThread().getName());
        System.out.println("Main thread priority : "+Thread.currentThread().getPriority());
    }
}
