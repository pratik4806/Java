/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callabledemo;

/**
 *
 * @author Deepak
 */
class ThreadTask implements Runnable
{
    public void run()
    {
        System.out.println("hi");
    }
}
public class Test1
{
    public static void main(String[] args)
    {
        ThreadTask tt=new ThreadTask();
        
        Thread t1=new Thread(tt);
        t1.start();
    }
}
