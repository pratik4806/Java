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

class MyThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=1; i<=100; i++)
        {
            System.out.println("child thread : "+i);
        }
    }
}
public class Test2
{
    public static void main(String[] args)
    {
        // main thread always executed first.
        for(int i=1; i<=100; i++)
        {
            System.out.println("main thread : "+i);
        }
        
        MyThread t1=new MyThread();
        t1.start();
    }
}
