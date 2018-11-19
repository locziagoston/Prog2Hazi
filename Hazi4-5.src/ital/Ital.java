/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.Objects;

/**
 *
 * @author Pig
 */
public abstract class Ital implements Comparable<Ital> {
    protected String név;
    protected String kiszerelés;
    protected int ár; 

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public void setKiszerelés(String kiszerelés) {
        this.kiszerelés = kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    public void setÁr(int ár) {
        this.ár = ár;
    }

    @Override
    public String toString() {
        return név + ", " + kiszerelés + ár + " Ft";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.név);
        hash = 79 * hash + Objects.hashCode(this.kiszerelés);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if  (obj==null || !(obj instanceof Ital))
            return false;
        Ital I = (Ital)obj;
        return this.név.equals(I.getNév()) && this.kiszerelés.equals(I.getKiszerelés());
    }
    
    @Override
    public int compareTo(Ital o) {
        return Integer.compare(this.getÁr(), o.getÁr()); 
    }
    
}
