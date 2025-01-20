/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPrograms;

/**
 *
 * @author Deepak
 */
public class CheckForPalindrome 
{
    public static void main(String[] args)
    {
        String str="abcba";
        
        int leng=str.length();
        String rev="";
        
        for(int i=leng-1; i>=0; i--)
        {
            rev=rev+str.charAt(i);
        }
        
        if(str.equals(rev))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}
