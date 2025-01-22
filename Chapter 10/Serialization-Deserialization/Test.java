/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serderdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Deepak
 */
class Aa implements Serializable
{
    
}
class Student extends Aa
{
    String name;
    int rollno;
    String school;
    
    public Student(String name, int rollno, String school)
    {
        System.out.println("111111");
        this.name=name;
        this.rollno=rollno;
        this.school=school;
    }
    
    public void show()
    {
        System.out.println("------------Student Details-------------");
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollno);
        System.out.println("School : "+school);
    }
}
public class Test   
{
    public static void main(String[] args) throws Exception
    {
        //-------------------Serialization----------------------------------------
        FileOutputStream fos=new FileOutputStream("D:\\student.txt");
        
        Student s1=new Student("Deepak", 101, "Smart Programming");
        
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);
        
        //-------------------Deserialization------------------------------------
        
        FileInputStream fis=new FileInputStream("D:\\\\student.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student s=(Student)ois.readObject();
        s.show();
    }
}
