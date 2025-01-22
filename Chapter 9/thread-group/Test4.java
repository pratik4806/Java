/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadgroupdemo;

/**
 *
 * @author Deepak
 */
public class Test4
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());
        System.out.println(Thread.currentThread().getPriority());
        
        //---------------------------------------------------------------------------------
        
        ThreadGroup tg=new ThreadGroup("sub-tg");
        
        Thread t1=new Thread(tg, "deepak thread");
        t1.start();
        
        Thread t2=new Thread(tg, "rahul thread");
        t2.start();
        
        System.out.println(tg.getMaxPriority());
        System.out.println(t1.getPriority());
        
        tg.setMaxPriority(7);
        
        System.out.println(tg.getMaxPriority());
        System.out.println(t1.getPriority());
        
        ThreadGroup sub_tg=new ThreadGroup(tg, "sub-sub-tg");
        System.out.println(sub_tg.getMaxPriority());
    }
}
