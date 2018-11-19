/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat11;

/**
 *
 * @author Pig
 */
public class Oktató extends Személy{
    public String Tanszék;

    public Oktató(String Tanszék, String nev, int eletkor, boolean ferfi) {
        super(nev, eletkor, ferfi);
        this.Tanszék = Tanszék;
    }
    
}
