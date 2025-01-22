/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
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
            Socket socket=new Socket("192.168.29.175", 2222);
            
            DataInputStream dis=new DataInputStream(socket.getInputStream());
            DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
            String str1="", str2="";
            while(!str1.equals("bye"))
            {
                str2=br.readLine();
                dos.writeUTF(str2);
                dos.flush();
                
                str1=dis.readUTF();
                System.err.println("Server Says : "+str1);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
