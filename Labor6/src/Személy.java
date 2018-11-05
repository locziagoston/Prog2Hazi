/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public abstract class Személy {
    private String név;
    private int szasz;

    public Személy(String név, int szasz) {
        this.név = név;
        this.szasz = szasz;
    }
    
    public abstract void metodus1();
    public void metodus2(){
        
        System.out.println("nem vagyok absztrakt");
    }
}
