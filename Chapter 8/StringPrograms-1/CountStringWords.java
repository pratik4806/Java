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
public class CountStringWords
{
    public static void main(String[] args)
    {
        String str="this is my first\n demo\t";
        
        int count=0;
        
        boolean b=true;
        
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==' ' || str.charAt(i)=='\t' || str.charAt(i)=='\n')
            {
                b=true;
            }
            else if(b==true)
            {
                b=false;
                count++;
            }
        }
        
        System.out.println("Total number of words : "+count);
    }
}
