/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat9;

/**
 *
 * @author Pig
 */
public class Hátizsák implements Comparable<Hátizsák> {
    
    private String márka;
    private double űrtartalom;
    private int zsebekSzama;
    private boolean vízhatlan;

    public Hátizsák(String márka, double űrtartalom, int zsebekSzama, boolean vízhatlan) {
        this.márka = márka;
        this.űrtartalom = űrtartalom;
        this.zsebekSzama = zsebekSzama;
        this.vízhatlan = vízhatlan;
    }

    public String getMárka() {
        return márka;
    }

    public double getŰrtartalom() {
        return űrtartalom;
    }

    public int getZsebekSzama() {
        return zsebekSzama;
    }

    public boolean isVízhatlan() {
        return vízhatlan;
    }

    @Override
    public String toString() {
        return "H\u00e1tizs\u00e1k{" + "m\u00e1rka=" + márka + ", \u0171rtartalom=" + űrtartalom + ", zsebekSzama=" + zsebekSzama + ", v\u00edzhatlan=" + vízhatlan + '}';
    }
    
    @Override
   public int compareTo(Hátizsák h) {
     if(this.márka.equals(h.getMárka())){
         return -1*Integer.compare(this.zsebekSzama, h.zsebekSzama);
     }
     else{
         return this.márka.compareTo(h.getMárka());
     
    }
   }
}
