/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztárok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pig
 */
public class Film implements Comparable<Film> {
    
    private String cím;
    private List<Szinesz> szinesz;
    
    
    public Film(String cím) {
        this.cím = cím;
        this.szinesz = new ArrayList<>();
    }
    

    public String getCím() {
        return cím;
    }

    public void setCím( String cím) {
        this.cím = cím;
    }
    
    public List<Szinesz>getSzinesz() {
        return szinesz;
       
    }
    
    public void setSzinesz(List<Szinesz> szinesz) {
        this.szinesz = szinesz;
    }
    
    @Override
    public int compareTo(Film o) {
        return (-1)*Integer.compare(this.szinesz.size(), o.getSzinesz().size()); //(-1)* a sorrendet megfordítjuk
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cím).append(":\n"); //sortot akkor használhatjuk ha van compareto-ja
        Collections.sort(szinesz); 
        for(int i=0;i<szinesz.size();i++)
            if(i<szinesz.size()-1)
            sb.append(szinesz.get(i)).append('\n');
            else
                sb.append(szinesz.get(i));
        return sb.toString();
    }
}
