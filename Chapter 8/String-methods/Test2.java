/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo2;

/**
 *
 * @author Deepak
 */
public class Test2 
{
    public static void main(String[] args)
    {
        //String str1=new String("deepak");
        
        String str2="deepak";
        int leng=str2.length();
        System.out.println(str2.length());
        
        System.out.println(str2.isEmpty());
        
        String str="           deepak                panwar           ";
        String s1 = str.trim();
        System.out.println(s1);
    }
}
