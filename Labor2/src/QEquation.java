/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class QEquation {
    
    private double a;
    private double b;
    private double c;

    public QEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getA(){
        
    return this.a;
    
    }
    public double getB(){
        
    return this.b;
    
    }
    public double getC(){
        
    return this.c;
    
    }
    public double getDiscriminat()
    {
        return this.b*this.b-4*this.a*this.c;
    }
    public double getRoot1()
    {
    if(this.getDiscriminat()>0)
    {
        return (-this.b+Math.sqrt(this.getDiscriminat()))/2*this.a; //math -> osztályszintű metódus!
    }
    else
        return 0;
    
    }

     public double getRoot2()
    {
    if(this.getDiscriminat()>0)
    {
        return (-this.b-Math.sqrt(this.getDiscriminat()))/2*this.a;
    }
    else
        return 0;
    }
}

