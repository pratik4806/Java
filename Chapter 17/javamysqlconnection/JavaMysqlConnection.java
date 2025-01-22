/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Deepak
 */
public class JavaMysqlConnection
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo","root","root");
            PreparedStatement ps=con.prepareStatement("insert into register values('aaa', 'aaa@gmail.com')");
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
