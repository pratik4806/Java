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
public class Test2
{
    public static void main(String[] args)
    {
        Predicate<String> p = str -> str.length() > 6;
        System.out.println(p.test("abc"));
        System.out.println(p.test("deepak@123"));
    }
}
