/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.Console;

/**
 *
 * @author Deepak
 */
public class ConsoleDemo 
{
    public static void main(String[] args)
    {
        try
        {
            Console c=System.console();
            String email1=c.readLine("Enter Email : ");

            char[] pass=c.readPassword("Enter Password : ");
            String pass1=new String(pass);

            if(email1.equals("admin@gmail.com") && pass1.equals("admin123"))
            {
                System.out.println("Login successfully");
            }
            else
            {
                System.out.println("login failed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
