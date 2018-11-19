/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat6.zh;

import java.util.Random;

/**
 *
 * @author Pig
 */
public class Hallgato {
    
    public int mennyitKészült;
    public boolean sokatTanul;

    public Hallgato(int mennyitKészült, boolean sokatTanul) {
        this.mennyitKészült = mennyitKészült;
        this.sokatTanul = sokatTanul;
    }

    public int getMennyitKészült() {
        return mennyitKészült;
    }

    public void setMennyitKészült(int mennyitKészült) {
        this.mennyitKészült = mennyitKészült;
    }

    public boolean isSokatTanul() {
        return sokatTanul;
    }

    public void setSokatTanul(boolean sokatTanul) {
        this.sokatTanul = sokatTanul;
    }

   public Dolgozat dolgozatotIr(){
       
       Random rnd = new Random();
       int n;
       if(sokatTanul == true) {
           n=(rnd.nextInt()%((7-4)+1)+4)*mennyitKészült;
           
       }
       else {
           n=(rnd.nextInt()%((5-0)+1)+0)*mennyitKészült;
           
            }
       
       Dolgozat k=new Dolgozat(n);
       
       if(k.pontszam==-1) {
           System.out.println("nem írt");
       }
       System.out.println(n);
       return k;
       
   }
    
}

