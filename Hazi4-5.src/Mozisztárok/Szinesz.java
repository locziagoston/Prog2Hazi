/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztárok;

/**
 *
 * @author Pig
 */
    public class Szinesz implements Comparable<Szinesz> {
    
    private String név;
    private int szÉv;

    public Szinesz(String név, int szÉv) {
        this.név = név;
        this.szÉv = szÉv;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getSzÉv() {
        return szÉv;
    }

    public void setSzév(int szÉv) {
        this.szÉv = szÉv;
    }

    @Override
    public String toString() {
        return this.szÉv+": "+this.név;
    }
  
    @Override
    public int compareTo(Szinesz o) {
        if(this.szÉv==o.getSzÉv()){
            return this.név.compareTo(o.getNév());
        }
        else{
            return Integer.compare(this.getSzÉv(), o.getSzÉv());
        }
    }
}
