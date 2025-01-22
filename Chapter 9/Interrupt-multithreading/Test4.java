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
class MyThread4 extends Thread
{
    public void run()
    {
        System.out.println("Is thread interrupted (1) : "+Thread.currentThread().isInterrupted());
        try
        {
            for(int i=1; i<=5; i++)
            {
                System.out.println("hi : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Is thread interrupted (2) : "+Thread.currentThread().isInterrupted());
    }
}
public class Test4
{
    public static void main(String[] args)
    {
        MyThread4 mt=new MyThread4();
        mt.start();
        
        mt.interrupt();
    }
}