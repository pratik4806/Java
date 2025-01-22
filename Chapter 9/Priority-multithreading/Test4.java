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
class MyThread4 extends Thread
{
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(i+" : "+Thread.currentThread().getName());
        }
    }
}
public class Test4 
{
    public static void main(String[] args)
    {
        MyThread4 mt4=new MyThread4();
        mt4.start();
        
        Thread.yield();
        
        for(int i=1; i<=10; i++)
        {
            System.out.println(i+" : "+Thread.currentThread().getName());
        }
    }
}
