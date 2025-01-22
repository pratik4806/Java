/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Deepak
 */
class MyThread extends Thread
{
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
public class Test 
{
    public static void main(String[] args)
    {
        MyThread mt1=new MyThread();
        mt1.start();
        
        MyThread mt2=new MyThread();
        mt2.start();
    }
}
