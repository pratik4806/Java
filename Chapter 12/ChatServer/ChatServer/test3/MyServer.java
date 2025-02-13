/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Deepak
 */
public class MyServer
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket serversocket=new ServerSocket(3333);
            System.out.println("Server is waiting for client");
            Socket socket=serversocket.accept();
            System.out.println("Client found");
            System.out.println("---------------------------------------------------");
            
            DataInputStream dis=new DataInputStream(socket.getInputStream());
            DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
            String str1="", str2="";
            while(!str1.equals("bye"))
            {
                str2=dis.readUTF();
                System.err.println("Client Says : "+str2);
                
                str1=br.readLine();
                dos.writeUTF(str1);
                dos.flush();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
