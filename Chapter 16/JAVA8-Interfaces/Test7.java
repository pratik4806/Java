/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.function.Supplier;

/**
 *
 * @author Deepak
 */
public class Test7 
{
    public static void main(String[] args)
    {
        //System.out.println(Math.random());  //it will provide any random value between 0 to 1
        //System.out.println((int)(Math.random()*100));
        
//        Supplier<Integer> s = () -> (int)(Math.random()*100);
//        System.out.println(s.get());
        
        Supplier<String> s = () ->
                                {
                                    String[] names={"deepak", "amit", "rahul", "deepesh", "kamal"};
                                    int i=(int)(Math.random()*4);
                                    return names[i];
                                };
        System.out.println(s.get());
    }
}
