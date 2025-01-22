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
public class CheckNoOfEvenOdds2 
{
    public static void main(String[] args)
    {
        int[] arr={2,6,1,5,9,3};
        
        //-----check no of even and odd elements in an array-----------
        int even_count=0, odd_count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                even_count=even_count+1;
            }
            else
            {
                odd_count=odd_count+1;
            }
        }
        //------------------------------------------------------------
        
        //----create an array for even and odd numbers-----------
        int[] even_arr=new int[even_count];
        int[] odd_arr=new int[odd_count];
        //-------------------------------------------------------
        
        //--------------put values in even and odd array---------
        int even_index_pos=0, odd_index_pos=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                even_arr[even_index_pos]=arr[i];
                even_index_pos=even_index_pos+1;
            }
            else
            {
                odd_arr[odd_index_pos]=arr[i];
                odd_index_pos=odd_index_pos+1;
            }
        }
        //-----------------------------------------------------------
        
        
        //--------print array values-----------------------------------
        for(int i=0; i<even_arr.length; i++)
        {
            System.out.print(even_arr[i]+" ");
        }
        System.out.println("\n===============================");
        for(int i=0; i<odd_arr.length; i++)
        {
            System.out.print(odd_arr[i]+" ");
        }
        //------------------------------------------------------------
    }
}
