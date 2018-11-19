/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pig
 */
public class Test {
    public static List<Hátizsák> kiír(List<Hátizsák> l) {
        Collections.sort(l);
        return l;
    }
    
    public static void main(String[] args) {
        List<Hátizsák> h=new ArrayList();
        h.add(new Hátizsák("Nika",20,5,true));
        h.add(new Hátizsák("Pumo",30,3,false));
        h.add(new Hátizsák("Adidos",40,4,true));
        h.add(new Hátizsák("Nika",25,4,false));
        h.add(new Hátizsák("Pumo",35,2,false));
        h.add(new Hátizsák("Adidos",45,5,true));
        h.add(new Hátizsák("Nika",30,3,true));
        h.add(new Hátizsák("Pumo",18,4,false));
        h.add(new Hátizsák("Adidos",22,4,true));
        h.add(new Hátizsák("Nika",31,2,true));
       
        List<Hátizsák> z=kiír(h);
        
        for (Hátizsák h1 : z) {
            System.out.println(h1);
        }
    
    }
    
}
