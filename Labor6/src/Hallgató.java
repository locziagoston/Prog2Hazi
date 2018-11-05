/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Hallgató extends Személy implements IGyenge,Hasonlítható<Hallgató>,Comparable<Hallgató> {
    
    private String nk;
    private double átlag;

    public Hallgató(String nk, double átlag, String név, int szasz) {
        super(név, szasz);
        this.nk = nk;
        this.átlag = átlag;
    }

    public String getNk() {
        return nk;
    }

    public void setNk(String nk) {
        this.nk = nk;
    }

    public double getÁtlag() {
        return átlag;
    }

    public void setÁtlag(double átlag) {
        this.átlag = átlag;
    }

    @Override
    public String toString() {
        return "Hallgat\u00f3{" + "nk=" + nk + ", \u00e1tlag=" + átlag + '}';
    }

    @Override
    public void metodus1() {
        System.out.println("Megletetm valósítva");
    }

    @Override
    public boolean gyengeE() {
    if (this.átlag<IGyenge.GYENGE)
        return true;
            else
        return false;
    }

    @Override
    public int hasonlít(Hallgató o) {
        return Double.compare(this.getÁtlag(),o.getÁtlag());
    }

    @Override
    public int compareTo(Hallgató o) {
        return Double.compare(this.getÁtlag(),o.getÁtlag());
    }
        
}