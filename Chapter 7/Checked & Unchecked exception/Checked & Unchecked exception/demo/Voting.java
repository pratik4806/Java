/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Deepak
 */
public class Voting
{
    public static void main(String[] args)
    {
        int age=10;
        
        Voting v=new Voting();
        v.checkAge(age);
    }
    void checkAge(int age)
    {
        if(age>=18)
        {
            youCanVote();
        }
        else
        {
            throw new RuntimeException("You cannot vote");
        }
    }
    void youCanVote()
    {
        System.out.println("you can vote successfully");
    }
}
