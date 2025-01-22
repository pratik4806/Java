/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpooldemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Deepak
 */
class MyThreadTask implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
public class Test
{
    public static void main(String[] args)
    {
        MyThreadTask mt=new MyThreadTask();
//        Thread t=new Thread(mt);
//        t.start();
        
        ExecutorService es=Executors.newFixedThreadPool(10);
        es.submit(mt);
        
        es.shutdown();
    }
}
