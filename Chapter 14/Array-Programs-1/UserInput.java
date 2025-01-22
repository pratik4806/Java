/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author Deepak
 */
public class UserInput
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=s.nextInt();
        
        int[] arr=new int[size];
        
        for(int i=0; i<size; i++)
        {
            System.out.println("Enter Number "+(i+1));
            arr[i]= s.nextInt();
        }
        
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
