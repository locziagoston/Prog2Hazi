/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molekula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pig
 */

public class Test {

   public static void main(String[] args) {
        List<Molekula> li1 = new ArrayList();
        List<Molekula> li2 = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            if (sor.equals("-")) {
                sor=sc.nextLine();
                List<String> sl = new ArrayList();
                String[] st = sor.split("[:,]");
                for (int i = 1; i < st.length; i++) {
                    sl.add(st[i]);
                }
                li2.add(new Molekula(st[0], sl));

            } else {
                String[] st = sor.split(":");
                li1.add(new Molekula(st[0], st[1]));
                sor=sc.nextLine();
            }
        }
        System.out.println("lista1");
        for(Molekula i:li1){
            System.out.println(i.toString());
        }
        System.out.println("\n");
        System.out.println("lista2");
        for(Molekula x:li2){
            System.out.println(x.toString());
        }
        }
}