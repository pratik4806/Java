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
public class Test3
{
    public static void main(String[] args)
    {
        ThreadGroup tg=new ThreadGroup("main-sub-thread-group");
        
        Thread t1=new Thread(tg, "deepak thread");
        Thread t2=new Thread(tg, "amit thread");

        t1.start();
        t2.start();
        
        System.out.println(tg.activeCount());   //2 threads are active
        System.out.println(tg.getParent().activeCount());   //1 threads are active
        
        System.out.println(tg.activeGroupCount());  //0
        System.out.println(tg.getParent().activeGroupCount());  //1
        System.out.println(tg.getParent().getParent().activeGroupCount());  
    }
}
