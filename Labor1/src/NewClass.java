/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class NewClass {
    
    public static void main(String[] args) {
        Hallgató  h1= new Hallgató("Bőrönd Ödön", "ASD123",1); //h1 hivatkozik az adott objektumra (bőrönd ödön ASD stb.
        Hallgató  h2= new Hallgató("Bőrönd Ella", "ASD124",1); // new utáni Hallgató a konstruktor (megegyezik az osztály nevével)
        
        h1.köszön(h2);
    }
}
