/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spclient;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Deepak
 */
public class MyClient
{
    public static void main(String[] args)
    {
        try
        {
            Socket socket=new Socket("192.168.29.175", 1111);
            
            OutputStream os=socket.getOutputStream();
            
            DataOutputStream dos=new DataOutputStream(os);
            
            String str="Hello Server";
            dos.writeUTF(str);
            
            dos.flush();
            
            dos.close();
            os.close();
            socket.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
