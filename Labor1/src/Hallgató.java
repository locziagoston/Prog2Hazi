/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Hallgató {
 String név;
 String nkód;
 double átlag;
 int év;

    public Hallgató(String név, String nkód, int év) {
        this.név = név;
        this.nkód = nkód;
        this.év = év;
    }
 
    
    
    

    public void köszön(Hallgató kinek)
        {
            System.out.println("Jó napot"+" "+ kinek.getNév());
 
        }
    public String getNév()
    {
        return név;
    }

 
}
