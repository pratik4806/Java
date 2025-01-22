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
class MyThread3 extends Thread
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
        try
        {
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
public class Test3
{
    public static void main(String[] args)
    {
        MyThread3 mt=new MyThread3();
        mt.start();
        
        mt.interrupt();
    }
}
