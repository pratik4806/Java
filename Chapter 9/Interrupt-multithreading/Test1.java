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
class MyThread1 extends Thread
{
    public void run()
    {
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
    }
}
public class Test1
{
    public static void main(String[] args)
    {
        MyThread1 mt=new MyThread1();
        mt.start();
        
        try
        {
            mt.join();  // this line will be exeucted by main thread, thus main thread will wait for another thread (Thread-0 - mt) to complete its task
            
            for(int i=1; i<=5; i++)
            {
                System.out.println("hello : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
