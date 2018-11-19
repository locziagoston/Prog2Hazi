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
public class Hallgató extends Személy{
    public double atlagtulajdonsag;

    public Hallgató(double atlagtulajdonsag, String nev, int eletkor, boolean ferfi) {
        super(nev, eletkor, ferfi);
        this.atlagtulajdonsag = atlagtulajdonsag;
    }
    
    public boolean okosvagynem(Hallgató o)
    {
        if(o.atlagtulajdonsag>=4)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return "Hallgato:" +sb.append(név+""+super.toString()) ;
    }
}