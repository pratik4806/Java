/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Deepak
 */
public class DeleteValues 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter your email id which you want to delete");
        String email1=s.next();
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo","root","root");
            
            PreparedStatement ps=con.prepareStatement("delete from register where email=?");
            ps.setString(1, email1);
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                System.out.println("i : "+i);
                System.out.println("Success");
            }
            else
            {
                System.out.println("Fail");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
