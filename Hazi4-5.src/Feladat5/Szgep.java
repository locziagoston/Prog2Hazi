/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat5;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Pig
 */
public class Szgep extends JFrame implements ActionListener{
    
    private JTextField tf1;
    private JButton ures, Backspace, Ce, C;
    private JButton MC, n7, n8, n9, oszt, sqrt;
    private JButton MR, n4, n5, n6, szor, szazalek;
    private JButton MS, n1, n2, n3, kul, tort;
    private JButton Mplus, n0, plusminus, tizedes, sum, egyenlo;
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel pe; //nagy panel
    
    public static int a;
    
    public Szgep() throws HeadlessException {
        super("szamologep");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.tf1= new JTextField(30);
        
        this.ures = new JButton("");
        this.Backspace = new JButton("Backspace");
        this.Ce = new JButton("CE");
        this.C = new JButton("C");
        this.MC = new JButton("MC");
        this.n7 = new JButton("7");
        this.n8 = new JButton("8");
        this.n9 = new JButton("9");
        this.oszt = new JButton("/");
        this.sqrt = new JButton("sqrt");
        this.MR = new JButton("MR");
        this.n4 = new JButton("4");
        this.n5 = new JButton("5");
        this.n6 = new JButton("6");
        this.szor = new JButton("*");
        this.szazalek = new JButton("%");
        this.MS = new JButton("MS");
        this.n1 = new JButton("1");
        this.n2 = new JButton("2");
        this.n3 = new JButton("3");
        this.kul = new JButton("-");
        this.tort = new JButton("1/x");
        this.Mplus = new JButton("M+");
        this.n0 = new JButton("0");
        this.plusminus = new JButton("+/-");
        this.tizedes = new JButton(".");
        this.sum = new JButton("+");
        this.egyenlo = new JButton("=");
        
        this.p1=new JPanel();
        this.p2=new JPanel();
        this.p3=new JPanel();
        this.p4=new JPanel();
        this.p5=new JPanel();
        this.p6=new JPanel();
        this.pe=new JPanel();
        
         GridLayout gr=new GridLayout(1,1);
        setLayout(gr);
        GridLayout gr1=new GridLayout(1,1);
        p1.setLayout(gr1);
        GridLayout gr2=new GridLayout(1,4);
        p2.setLayout(gr2);
        GridLayout gr3=new GridLayout(1,6);
        p3.setLayout(gr3);
        GridLayout gr4=new GridLayout(1,6);
        p4.setLayout(gr4);
        GridLayout gr5=new GridLayout(1,6);
        p5.setLayout(gr5);
        GridLayout gr6=new GridLayout(1,6);
        p6.setLayout(gr6);
        GridLayout gr7=new GridLayout(6,1);
        pe.setLayout(gr7);
        
        p1.add(tf1);
        p2.add(ures);
        p2.add(Backspace);
        p2.add(Ce);
        p2.add(C);
        p3.add(MC);
        p3.add(n7);
        p3.add(n8);
        p3.add(n9);
        p3.add(oszt);
        p3.add(sqrt);
        p4.add(MR);
        p4.add(n4);
        p4.add(n5);
        p4.add(n6);
        p4.add(szor);
        p4.add(szazalek);
        p5.add(MS);
        p5.add(n1);
        p5.add(n2);
        p5.add(n3);
        p5.add(kul);
        p5.add(tort);
        p6.add(Mplus);
        p6.add(n0);
        p6.add(plusminus);
        p6.add(tizedes);
        p6.add(sum);
        p6.add(egyenlo);
        
        pe.add(p1);
        pe.add(p2);
        pe.add(p3);
        pe.add(p4);
        pe.add(p5);
        pe.add(p6);
        
        this.add(pe);
        sum.addActionListener(this);
        egyenlo.addActionListener(this);
        super.pack();
        
        
    }
    public static void main(String[] args){
        Szgep sz=new Szgep();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    if(e.getSource() == sum) {
            a+=Integer.parseInt(tf1.getText());
        }
        if(e.getSource() == egyenlo) {
            a+=Integer.parseInt(tf1.getText());
            tf1.setText(Integer.toString(a));
        }
    }
    
}
