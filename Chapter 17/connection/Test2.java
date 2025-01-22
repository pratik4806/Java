/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Deepak
 */
public class Test2
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo","root","root");
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
