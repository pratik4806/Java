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
class MyThread5 extends Thread
{
    public void run()
    {
        System.out.println("Is thread interrupted (1) : "+Thread.interrupted());
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
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (3) : "+Thread.interrupted());
    }
}
public class Test5
{
    public static void main(String[] args)
    {
        MyThread5 mt=new MyThread5();
        mt.start();
        
        mt.interrupt();
    }
}