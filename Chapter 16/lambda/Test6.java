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
interface I6
{
    int getLength(String name);
}
public class Test6
{
    public static void main(String[] args)
    {
//        I6 i=(name)->
//            {
//                int leng=name.length();
//                return leng;
//            };
//        System.out.println(i.getLength("deepak"));
        
        //int l=i.getLength("deepak");
        //System.out.println("length is : "+l);
        
        
        I6 i=(name)-> name.length();
        System.out.println(i.getLength("deepesh"));
    }
}
