/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fénykép;

import java.util.Scanner;


public class Test {
        
    private static fényképezőgép fnyg[];
    
    private static void kiir(fényképezőgép[] t){
        for (int i=0; i<t.length;i++){
            System.out.println(t[i]);
        }
    }
    
    public static void main(String[] args) {
        
        int n;
        Scanner sc= new Scanner (System.in);
        n = Integer.parseInt(sc.nextLine());
        fnyg = new fényképezőgép[n];
        
        for (int i=0; i<n; i++){
            String sor = sc.nextLine();
            String st[] = sor.split(":");
            fnyg[i] = new fényképezőgép(st[0], st[1]);
        }
            kiir(fnyg);    
        
    }
}
