/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Deepak
 */





public class Test7
{
    JFrame jf;
    JButton jb;
    
    Test7()
    {
        jf=new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        
        jb=new JButton("Click Me");
        jb.addActionListener(
                (e) -> { JOptionPane.showMessageDialog(jf, "Button clicked...!!"); }
        );
        jb.setBounds(100, 100, 100, 50);
        jf.add(jb);
        
        jf.setVisible(true);
    }
    public static void main(String[] args)
    {
        new Test7();
    }
}








//public class Test7
//{
//    JFrame jf;
//    JButton jb;
//    
//    Test7()
//    {
//        jf=new JFrame();
//        jf.setSize(400,400);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jf.setLayout(null);
//        
//        jb=new JButton("Click Me");
//        jb.addActionListener(new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent e) 
//            {
//                JOptionPane.showMessageDialog(jf, "Button clicked");
//            }
//        });
//        jb.setBounds(100, 100, 100, 50);
//        jf.add(jb);
//        
//        jf.setVisible(true);
//    }
//    public static void main(String[] args)
//    {
//        new Test7();
//    }
//}





//public class Test7 implements ActionListener
//{
//    JFrame jf;
//    JButton jb;
//    
//    Test7()
//    {
//        jf=new JFrame();
//        jf.setSize(400,400);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jf.setLayout(null);
//        
//        jb=new JButton("Click Me");
//        jb.addActionListener(this);
//        jb.setBounds(100, 100, 100, 50);
//        jf.add(jb);
//        
//        jf.setVisible(true);
//    }
//    public static void main(String[] args)
//    {
//        new Test7();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) 
//    {
//        if(e.getSource()==jb)
//        {
//            JOptionPane.showMessageDialog(jf, "Button clicked");
//        }
//    }
//}
