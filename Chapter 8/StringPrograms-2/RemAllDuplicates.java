/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPrograms2;

import java.util.Arrays;

/**
 *
 * @author Deepak
 */
public class RemAllDuplicates
{
    public static void main(String[] args)
    {
        String str="deepak java";
        
        char[] ch=str.toCharArray();
        
        int count=0;
        
        for(int i=0; i<str.length(); i++)
        {
            int j;
            for(j=0; j<i; j++)
            {
                if(ch[i]==ch[j])
                {
                    break;
                }
            }
            if(i==j)
            {
                ch[count]=ch[i];
                count++;
            }
        }
        //System.out.println(ch);
//        while(count<str.length())
//        {
//            ch[count]=' ';
//            count++;
//        }
//        System.out.println(ch);
        
        String newstr=String.valueOf(Arrays.copyOf(ch, count));
        System.out.println(newstr);
    }
}
