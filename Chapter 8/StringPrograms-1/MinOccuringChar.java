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
public class MinOccuringChar 
{
    public static void main(String[] args)
    {
        String str="adbccbdcddcc";
        
        int[] arr=new int[126];
        
        for(int i=0; i<str.length(); i++)
        {
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }
        
        int min=str.length();
        char c=' ';
        for(int i=0; i<str.length(); i++)
        {
            if(min>arr[str.charAt(i)])
            {
                min=arr[str.charAt(i)];
                c=str.charAt(i);
            }
        }
        
        System.out.println("Minimum repeated character is : "+c);
    }
}
