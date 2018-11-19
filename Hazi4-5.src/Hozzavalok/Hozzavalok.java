/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hozzavalok;

/**
 *
 * @author Pig
 */
public class Hozzavalok implements Comparable<Hozzavalok>{
    
    public String hozzavalok;
    public int db;

    public Hozzavalok(String hozzavalok, int db) {
        this.hozzavalok = hozzavalok;
        this.db = db;
    }

    public String getHozzavalok() {
        return hozzavalok;
    }

    public void setHozzavalok(String hozzavalok) {
        this.hozzavalok = hozzavalok;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }
    
    @Override
    public String toString() {
        return hozzavalok + ";" + db;
    }

    @Override
    public int compareTo(Hozzavalok h) {
        int menny = h.db - this.db;
        if(menny != 0)
            return menny;
        return this.hozzavalok.compareTo(h.hozzavalok);
    }
}


