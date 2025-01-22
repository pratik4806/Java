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
public class Test1 extends Thread
{
    public void run()
    {
        System.out.println("hi");
        System.out.println("1 : "+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }
    public static void main(String[] args)
    {
        Test1 t1=new Test1();
        t1.start();
        System.out.println("2 : "+Thread.currentThread().getName());
        
        System.out.println(t1.isAlive());
    }
}
