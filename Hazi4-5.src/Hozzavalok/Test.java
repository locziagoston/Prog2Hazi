/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hozzavalok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pig
 */
public class Test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Hozzavalok> hozzavalok = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] sor = sc.nextLine().split(";");
            if(sor[0].equals("0"))
                break;
            int d = Integer.parseInt(sor[1]);
            Hozzavalok tmp = null;
            for (Hozzavalok h : hozzavalok) {
                if(h.hozzavalok.equals(sor[0])){
                    tmp = h;
                    break;
                }
            }
            if(tmp != null){
                tmp.db += d;
            } else {
                hozzavalok.add(new Hozzavalok(sor[0], d));
            }
        }
        Collections.sort(hozzavalok);
        for (Hozzavalok h : hozzavalok) {
            System.out.println(h);
        }
    }
}

    

    

