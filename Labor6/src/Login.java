
import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Frame;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Login extends JFrame{
    
    private JButton bt;
    private JTextField tf1;
    private JTextField tf2;
    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    
    private jPanel p1;
    
    public Login() throws HeadlessException{
        super("Login");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bt= new JButton("Login");
        tf1=new JTextField(30);
        tf2=new JTextField(30);
        lb1=new JLabel("Username");
        lb2=new JLabel("Password");
        lb3=new JLabel("");
        
        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(bt);
        add(lb3);
        
        pack();
    }
    
    public static void main(String[] args) {
        Login l=new Login();
    }
}
