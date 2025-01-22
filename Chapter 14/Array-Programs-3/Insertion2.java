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
public class Insertion2
{
    public static void main(String[] args)
    {
        int[] arr={10,50,30,80,90,70};
        
        int pos=3;
        int new_element=60;
        
        int[] new_arr=new int[arr.length+1];
        for(int i=0; i<arr.length; i++)
        {
            new_arr[i]=arr[i];
        }
        
        for(int i=new_arr.length-1; i>pos-1; i--)
        {
            new_arr[i]=new_arr[i-1];
        }
        new_arr[pos-1]=new_element;
        
        
        for(int i=0; i<new_arr.length; i++)
        {
            System.out.print(new_arr[i]+" ");
        }
    }
}
