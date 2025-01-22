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
public class PasswordGenerator
{
    static String name;
    static int dob;
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name : ");    //deepak
        name=s.next();
        System.out.println("Enter DOB : ");
        dob=s.nextInt();
        
        String newname=PasswordGenerator.getSpecifiedString();
        int newdob=PasswordGenerator.dobAlgo();
        
        String newpass="SP"+newname+"@"+newdob;
        System.out.println("Your password is : "+newpass);
    }
    static String getSpecifiedString()
    {
        String newname;
        char c=name.charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            //newname=name.substring(1, 3);
            char c1=name.charAt(0);
            char c2=name.charAt(1);
            newname=String.valueOf(c1)+String.valueOf(c2).toUpperCase();
        }
        else
        {
            char c1=name.charAt(0);
            char c2=name.charAt(name.length()-1);
            newname=String.valueOf(c1)+String.valueOf(c2).toUpperCase();
        }
        return newname;
    }
    static int dobAlgo()
    {
        int newdob=0, rem;
        while(dob!=0)
        {
            rem=dob%10;
            newdob=newdob*10+rem;
            dob=dob/10;
        }
        return (newdob+100);
    }
}
