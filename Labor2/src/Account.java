
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Account {
    private int id;
    private double balance;
    private static double annualTR=10;
    private Date dateCreated;
    
    public static double getAnnualTR()
    {
        return annualTR; //osztályszintű változó ezért nem kell this
    }
    
}
