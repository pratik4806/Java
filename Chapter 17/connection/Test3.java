/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import dbconnection.DbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Deepak
 */
public class Test3
{
    public static void main(String[] args) throws ClassNotFoundException
    {        
        try(
                Connection con=DbConnection.getConnection();
                
                PreparedStatement ps=con.prepareStatement("select * from register");
                ResultSet rs=ps.executeQuery();
           )
        {
            while(rs.next())
            {
                System.out.println("Name : "+rs.getString("name"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
