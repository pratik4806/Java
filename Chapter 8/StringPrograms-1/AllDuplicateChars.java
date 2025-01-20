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
public class AllDuplicateChars
{
    public static void main(String[] args)
    {
        String str="abdbcdbdd";
        
        str=str.replaceAll("\\s", "");
        //System.out.println(str);
        
        int[] arr=new int[126];
        
        for(int i=0; i<str.length(); i++)
        {
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>1)
            {
                System.out.println((char)i+" repeated "+arr[i]+" times");
            }
        }
    }
}
