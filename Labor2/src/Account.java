
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
    private static double annualTR = 10; //ez csak egyszer jön létre a memóriában, míg a többi töbször is
    private Date dateCreated;
    
    public Account()
    {
            this.id = 0;
            this.balance = 0;
            this.dateCreated = new Date();
            
    }
//alt+insert
    public Account(int id, double balance, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int v) //v az egy lokális változó a fügygvény belsejében bármi lehet
    {
        this.id=v;
    }
    
    public double getBalance()
    {
        return this.balance;
    }
    
    public void setBalance(double v)
    {
        this.balance=v;
    }
    
    public Date getDateCreated()
    {
        return this.dateCreated;
    }
   
    public static double getAnnualTR()
    {
        return annualTR; //osztályszintű változó ezért nem kell this
    }
    
    public static void setAnnualTR(double v)
    {
        annualTR=v;
    }
    
    public static double getMounthlyTR()
    {
        return annualTR/12;
    }
    
    public void withdraw(double pénz)
    {
        this.balance=this.balance-pénz;
    }
    
    public void deposit(double pénz)
    {
        this.balance=this.balance+pénz;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + ", dateCreated=" + dateCreated + '}';
    }
    
}
