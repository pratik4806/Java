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
public class AnonymousArray 
{
    public static void main(String[] args)
    {
        //int[] arr={10,20,30};
        
        AnonymousArray.sum( new int[]{10,20,30} );
        
    }
    static void sum(int[] a)
    {
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of array is : "+sum);
    }
}
