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


public class Test4 
{
    public static void main(String[] args)
    {
        Function<Integer, Integer> f = sal -> sal*12;
        
        System.out.println(f.apply(10000)+" lpa");
        System.out.println(f.apply(40000)+" lpa");
    }
}
