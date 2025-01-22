/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.function.Function;

/**
 *
 * @author Deepak
 */
public class Test5 
{
    public static void main(String[] args)
    {
        Function<String, Integer> f = str -> str.length();
        
        System.out.println(f.apply("deepak"));
        System.out.println(f.apply("amit"));
    }
}
