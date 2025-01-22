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
public class ScannerDemo
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Email : ");
        String email1=s.next();
        System.out.println("Enter Password : ");
        String pass1=s.next();
        if(email1.equals("admin@gmail.com") && pass1.equals("admin123"))
        {
            System.out.println("login successfully");
        }
        else
        {
            System.out.println("login failed");
        }
    }
}
