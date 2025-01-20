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
public class RevAString
{
    public static void main(String[] args)
    {
        String name="deepak";
        
        int leng=name.length();
        String rev="";
        
        for(int i=leng-1; i>=0; i--)
        {
            //System.out.println(name.charAt(i));
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}
