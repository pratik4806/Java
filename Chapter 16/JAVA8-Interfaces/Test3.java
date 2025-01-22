/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.function.Predicate;

/**
 *
 * @author Deepak
 */
public class Test3 
{
    public static void main(String[] args)
    {
        Predicate<String> p1 = pass -> pass.length() > 6 ;
        Predicate<String> p2 = pass -> pass.equals("admin@123");
        
//        System.out.println(p1.test("abc12345"));
//        System.out.println(p2.test("deepak@123"));
        
//        Predicate p=p1.and(p2);
//        System.out.println(p.test("admin@12"));
        
        Predicate p=p1.or(p2);
        System.out.println(p.test("admin@12"));
    }
}
