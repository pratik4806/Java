/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingdemo3;

/**
 *
 * @author Deepak
 */
public class Test4 extends Thread
{
    public void run()
    {
        System.out.println("hi");
        System.out.println("Child thread : "+Thread.currentThread().isDaemon());
    }
    public static void main(String[] args)
    {
        Test4 t4=new Test4();
        t4.setDaemon(true);
        t4.start();
        
        System.out.println("Main thread : "+Thread.currentThread().isDaemon());
    }
}
