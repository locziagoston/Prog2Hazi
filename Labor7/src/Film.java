/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Film implements Comparable<Film> {
    
    private String cím;
    private int gyÉv;

    public Film(String cím, int gyÉv) {
        this.cím = cím;
        this.gyÉv = gyÉv;
    }

    public String getCím() {
        return cím;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public int getGyÉv() {
        return gyÉv;
    }

    public void setGyÉv(int gyÉv) {
        this.gyÉv = gyÉv;
    }

    @Override
    public String toString() {
        return this.gyÉv+": "+this.cím;
    }

    @Override
    public int compareTo(Film o) {
        if(this.gyÉv==o.getGyÉv()){
            return this.cím.compareTo(o.getCím());
        }
        else{
            return Integer.compare(this.getGyÉv(), o.getGyÉv());
        }
    }
    
}
