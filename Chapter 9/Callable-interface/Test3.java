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
class ThreadTask3 implements Runnable
{
    ThreadLocal tl=new ThreadLocal();
    
    public void run()
    {
        tl.set("deepak");
        
        //System.out.println("hi : "+tl.get());
        display();
    }
    void display()
    {
        System.out.println("hi : "+tl.get());
        tl.remove();
        System.out.println("hi : "+tl.get());
    }
}
public class Test3 
{
    public static void main(String[] args)
    {
        ThreadTask3 tt=new ThreadTask3();
        
        Thread t=new Thread(tt);
        t.start();
    }
}
