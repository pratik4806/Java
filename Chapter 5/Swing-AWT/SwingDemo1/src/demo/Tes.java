
package demo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Deepak
 */
public class Test
{
    public static void main(String[] args)
    {
        JFrame jf=new JFrame();
        jf.setSize(600, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        
        JLabel jl=new JLabel("Enter Name : ");
        jl.setBounds(100, 50, 100, 30);
        jf.add(jl);
        
        JTextField jt=new JTextField();
        jt.setBounds(200, 50, 250, 40);
        jf.add(jt);
        
        JButton jb1=new JButton("Click Me");
        jb1.setBounds(200, 150, 120, 40);
        jf.add(jb1);
        
        jf.setVisible(true);
    }
}
