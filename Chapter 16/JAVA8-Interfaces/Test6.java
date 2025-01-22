/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.function.Consumer;

/**
 *
 * @author Deepak
 */
public class Test6
{
    public static void main(String[] args)
    {
        Consumer<String> c = str -> System.out.println("hi : "+str.concat("@gmail.com"));
        
        c.accept("deepak");
        c.accept("rahul");
    }
}
