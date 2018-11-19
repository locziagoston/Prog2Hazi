/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat4;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Pig
 */
public class IdoAtalakito extends JFrame implements ActionListener {
    
    private JButton bt;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;
    private JTextField tf7;
    private JTextField tf8;
    private JTextField tf9;
    private JTextField tf10;
    private JTextField tf11;
    private JTextField tf12;

    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb4;
    private JLabel lb5;
    private JLabel lb6;
    private JLabel lb7;
    private JLabel lb8;
    private JLabel lb9;
    private JLabel lb10;
    private JLabel lb11;
    private JLabel lb12;
    
    private JPanel aperc;
    private JPanel bperc;
    private JPanel cperc;
    private JPanel p4;
    private JPanel pe;


    public IdoAtalakito() throws HeadlessException {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf1 = new JTextField(6);
        tf2 = new JTextField(6);
        tf3 = new JTextField(6);
        tf4 = new JTextField(6);
        tf5 = new JTextField(6);
        tf6 = new JTextField(6);
        tf7 = new JTextField(6);
        tf8 = new JTextField(6);
        tf9 = new JTextField(6);
        tf10 = new JTextField(6);
        tf11 = new JTextField(6);
        tf12 = new JTextField(6);
        bt = new JButton("Számol");
        lb1 = new JLabel("nap");
        lb2 = new JLabel("óra");
        lb3 = new JLabel("perc");
        lb4 = new JLabel("másodperc");
        lb5 = new JLabel("nap");
        lb6 = new JLabel("óra");
        lb7 = new JLabel("perc");
        lb8 = new JLabel("másodperc");
        lb9 = new JLabel("nap");
        lb10 = new JLabel("óra");
        lb11 = new JLabel("perc");
        lb12 = new JLabel("másodperc");

        aperc = new JPanel();
        bperc = new JPanel();
        cperc = new JPanel();
        p4 = new JPanel();
        pe = new JPanel();

        GridLayout gr = new GridLayout(4, 1);
        pe.setLayout(gr);
        GridLayout gr2 = new GridLayout(1, 1);
        cperc.setLayout(gr2);

        aperc.add(tf1);
        aperc.add(lb1);
        aperc.add(tf2);
        aperc.add(lb2);
        aperc.add(tf3);
        aperc.add(lb3);
        aperc.add(tf4);
        aperc.add(lb4);
        bperc.add(tf5);
        bperc.add(lb5);
        bperc.add(tf6);
        bperc.add(lb6);
        bperc.add(tf7);
        bperc.add(lb7);
        bperc.add(tf8);
        bperc.add(lb8);
        cperc.add(bt);
        p4.add(tf9);
        p4.add(lb9);
        p4.add(tf10);
        p4.add(lb10);
        p4.add(tf11);
        p4.add(lb11);
        p4.add(tf12);
        p4.add(lb12);
        pe.add(aperc);
        pe.add(bperc);
        pe.add(cperc);
        pe.add(p4);

        this.add(pe);

        bt.addActionListener(this);
        pack();
    }

    public static void main(String[] args) {
        IdoAtalakito i = new IdoAtalakito();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt) {
            int anap = Integer.parseInt(tf1.getText());
            int aora = Integer.parseInt(tf2.getText());
            int aperc = Integer.parseInt(tf3.getText());
            int amasodperc = Integer.parseInt(tf4.getText());

            int bnap = Integer.parseInt(tf5.getText());
            int bora = Integer.parseInt(tf6.getText());
            int bperc = Integer.parseInt(tf7.getText());
            int bmasodperc = Integer.parseInt(tf8.getText());

            int cnap = 0;
            int cora = 0;
            int cperc = 0;
            int cmasodperc = 0;

            if (amasodperc + bmasodperc >= 60) {
                cmasodperc = (amasodperc + bmasodperc) %60;
                cperc = cperc + (amasodperc + bmasodperc) /60;
            } else {
                cmasodperc = amasodperc + bmasodperc;
            }
            if ((aperc + bperc + cperc) >= 60) {
                cora = cora + (aperc + bperc + cperc) /60;
                cperc = (aperc + bperc + cperc) %60;
            } else {
                cperc = aperc + bperc + cperc;
            }
            if ((aora + bora + cora) >=24) {
                cnap = cnap + (aora + bora + cora) /24;
                cora = (aora + bora + cora) %24;
                
            } else {
                cora = aora + bora + cora;
            }
            cnap = anap + bnap + cnap;

            tf12.setText("" + cmasodperc);
            tf11.setText("" + cperc);
            tf10.setText("" + cora);
            tf9.setText("" + cnap);
        }
    }

}
