/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundsdemo;

/**
 *
 * @author Deepak
 */
class A<T extends Number & Runnable>
{
    void show(T t)
    {
        System.out.println(t);
    }
}
public class Test
{
    public static void main(String[] args)
    {
        //A<Integer> ob=new A<Integer>();
        //ob.show(101);
        
        //A<Float> ob2=new A<Float>();
        //ob2.show(100f);
        
        //A<String> ob3=new A<String>();
        
    }
}
