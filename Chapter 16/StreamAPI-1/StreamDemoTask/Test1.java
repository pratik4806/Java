/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Deepak
 */

//WAP to print all the numbers which are greater than 30
//(functional interfaces, lambda expression, Predefined Functional Interfaces, Stream API)

public class Test1 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        
        al.stream().filter(e->e>30).forEach(e->System.out.println(e));
        
        /*----------------------------------------------------
        Stream<Integer> s=al.stream();
        
        Predicate<Integer> p=(e)->
                    {
                        return e>30;
                    };
        
        Consumer<Integer> c=(e)->
                            {
                                System.out.println(e);
                            };
        
        s.filter(p).forEach(c);
                ----------------------------------------*/
        
        //Stream<Integer> s=al.stream();
        //s.filter(e->e>30).forEach(e->System.out.println(e));
        
        
    }
}
