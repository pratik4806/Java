/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serderdemo;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * @author Deepak
 */
class Employee implements Externalizable
{
    String name;
    int empid;
    String email;
    String phoneno;
    
    public Employee(){}
    
    public Employee(String name, int empid, String email, String phoneno)
    {
        this.name=name;
        this.empid=empid;
        this.email=email;
        this.phoneno=phoneno;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException 
    {
        String[] new_email=email.split("@");
        String new_email1=new_email[0];
        
        String[] new_phno=phoneno.split(" ");
        String new_phno1=new_phno[1];
        
        out.writeUTF(name);
        out.writeInt(empid);
        out.writeUTF(new_email1);
        out.writeUTF(new_phno1);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {
        name=in.readUTF();
        empid=in.readInt();
        email=in.readUTF()+"@gmail.com";
        phoneno="+91 "+in.readUTF();
    }
    void show()
    {
        System.out.println("Name : "+name);
        System.out.println("Empid : "+empid);
        System.out.println("Email : "+email);
        System.out.println("Phone No : "+phoneno);
    }
}
public class ExtDemo 
{
    public static void main(String[] args) throws Exception
    {
        Employee emp1=new Employee("deepak", 101, "deepak@gmail.com", "+91 6283830308");
        FileOutputStream fos=new FileOutputStream("D:\\\\\\\\student.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(emp1);
        
        //-----------------------------------------------------------------------------
        
        FileInputStream fis=new FileInputStream("D:\\\\\\\\student.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Employee empp=(Employee)ois.readObject();
        empp.show();
    }
}
