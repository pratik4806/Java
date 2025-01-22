/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author Deepak
 */
public class DbConnection 
{
    static Connection con;
    
    static String driver_class, jdbc_url, username, password;
    
    public static Connection getConnection()
    {
        try
        {
            Properties p=new Properties();
            //FileInputStream fis=new FileInputStream("C:\\Users\\Deepak\\Documents\\NetBeansProjects\\JdbcDemo3\\src\\dbconnection\\dbdetails.properties");
            InputStream is=DbConnection.class.getResourceAsStream("dbdetails.properties");
            p.load(is);
            
            driver_class=p.getProperty("driver_class");
            jdbc_url=p.getProperty("url");
            username=p.getProperty("username");
            password=p.getProperty("password");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        try
        {
            Class.forName(driver_class);
            con=DriverManager.getConnection(jdbc_url,username,password);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
