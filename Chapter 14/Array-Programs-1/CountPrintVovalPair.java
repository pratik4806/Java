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
public class CountPrintVovalPair
{
    public static void main(String args[]) 
    {
        String str = "beautiful beauties";  //abcdef
        
        int leng = str.length();
        countVowelPairs(str.toUpperCase(), leng);
    }
    
    static void countVowelPairs(String s, int leng)
    {
        int count = 0;
        String[] str=new String[leng-1];
        int str_index=0;
        for (int i=0; i<leng-1; i++) 
        {
            if (isVowel(s.charAt(i)) && isVowel(s.charAt(i+1)))
            {
                count=count+1;
                str[str_index]=String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i+1));
                str_index=str_index+1;
            }
        }
        
        System.out.println("====================================");
        
        for(int i=0; i<str.length; i++)
        {
            if(str[i]!=null)
            {
                System.out.print(str[i]+" ");
            }
        }
        System.out.println("\nTotal pairs are : "+count);
    }
    
    static boolean isVowel(char ch)
    {
        switch (ch)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
