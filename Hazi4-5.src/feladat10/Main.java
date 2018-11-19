/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pig
 */
    public class Main {
    
    public static Autó[] a;
    
    public static List<Autó> MaxTelj(List<Autó> a){
        Collections.sort(a);
        if(a.size()<3) {
            return a;
        }
        List<Autó> lista=new ArrayList<Autó>();
        if(a.size()>=3) {
          for(int i=0;i<3;i++){
            lista.add(a.get(i));
           }
          return lista;
        }
        return null;
    }
    
    public static List<Teherautó> Teherbírás(Autó [] a) {
        List<Teherautó> t=new ArrayList<>();
        for(int i=0;i<a.length;i++) {
            if(a[i] instanceof Teherautó) {
                Teherautó tt=(Teherautó) a[i];
                    if(tt.getTeherbírás()>2000){
                        t.add(tt);
                    }
            } 
        }
         return t;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        a=new Autó[4];
        for(int i=0;i<4;i++) {
            String sor=sc.nextLine();
            String st[]=sor.split(" ");
               if(i<2){
                    a[i]=new Autó(st[0],Integer.parseInt(st[1]),Boolean.parseBoolean(st[2]));
               }
                else {
                   a[i]=new Teherautó(st[0],Integer.parseInt(st[1]),Boolean.parseBoolean(st[2]),Integer.parseInt(st[3]));
               }
        }

        for (Autó n : a) {
            System.out.println(n);
        }
        List<Teherautó> out=Teherbírás(a);
        for (Teherautó b : out) {
            System.out.println(b);
        }
            System.out.println(Autó.db);
        }
    }