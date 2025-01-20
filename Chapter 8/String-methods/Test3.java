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
public class Test3
{
    public static void main(String[] args)
    {
//        String str1="Deepak@gmail.com";
//        String str2="deepak123";
        
        //System.out.println(str1.equals(str2));
//        if(str1.equalsIgnoreCase("deepak@gmail.com") && str2.equals("deepak123"))
//        {
//            System.out.println("login successfully");
//        }
//        else
//        {
//            System.out.println("failed");
//        }
        
//        String str1="a";
//        String str2="A";
//        System.out.println(str1.compareToIgnoreCase(str2));
        
        
        
        //char c='a';   //97
//        char c='A';     //65
//        System.out.println((int)c);
        
//        String str1="deepak";
//        String str2="java";
//        System.out.println(str1+str2);
//        System.out.println(str1.concat(str2));
        
        //-----------------------------------------------------------------------
        
//        String str1="deepak java";
//        System.out.println(str1.substring(3, 8));
//        System.out.println(str1.subSequence(3, 8));
        
        //----------------------------------------------------------------------
        
//        String str1="deepak java";
//        System.out.println(str1.replace("e", "x"));
        
        //---------------------------------------------------------------------
        
//        String str1="deepak is teaching java";
//        //System.out.println(str1.lastIndexOf("is"));
//        //System.out.println(str1.contains("ep"));
//        //System.out.println(str1.charAt(7));
//        System.out.println(str1.startsWith("deea"));
//        System.out.println(str1.endsWith("java"));
        
        //----------------------------------------------------------------------
        
//        String str1="Deepak Panwar";
//        System.out.println(str1.toLowerCase());
        
        //----------------------------------------------------------------------
        
//        int rollno=1001;
//        System.out.println(String.valueOf(rollno).length());
//        
//        String str1="deepak";
//        char[] c=str1.toCharArray();
//        System.out.println(c);
//        
//        System.out.println(str1.replaceFirst("e", "z"));
        
        //------------------------------------------------------------------------
        String str2="this is my first demo";
        String[] str=str2.split("is");
        for(String s:str)
        {
            System.out.println(s);
        }
        
        
    }
}
