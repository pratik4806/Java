/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Deepak
 */
@FunctionalInterface
interface I2
{
    void m2();
}
public class Test2
{
    public static void main(String[] args)
    {
//        I2 i=() ->
//            {
//                System.out.println("hi i am lambda function...!");
//            };
//        i.m2();
        
        I2 i=() -> {System.out.println("hi i am in lambda function..!!");};
        i.m2();
    }
}
