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
class MyThread3 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1; i<=10; i++)
            {
                System.out.println(i+" : "+Thread.currentThread().getName());

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
        MyThread3 mt3=new MyThread3();
        mt3.start();
        
        try
        {
            for(int i=1; i<=10; i++)
            {
                System.out.println(i+" : "+Thread.currentThread().getName());

                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
