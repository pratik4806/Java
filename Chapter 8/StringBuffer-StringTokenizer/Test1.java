/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo3;

import java.util.StringTokenizer;

/**
 *
 * @author Deepak
 */
public class Test1
{
    public static void main(String[] args)
    {
        StringTokenizer st=new StringTokenizer("this is my first demo");
        System.out.println(st.countTokens());
        
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
