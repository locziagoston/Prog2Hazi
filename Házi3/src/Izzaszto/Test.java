
package Izzaszto;

import java.util.Scanner;

public class Test {
    public static Izzaszto[] iz;
    //private static String[] uj;
    
    public static void Kiir(Izzaszto[] a) {
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        String[] s = sor.split(" ");
        int n = Integer.parseInt(s[0]);
        String v = s[1];
        //int count = 0;
        
        for (int i = 1; i < n; i++) { //!!!  az i=1-ről indul: az első diák már a tömben van
            sor = sc.nextLine();     //figyelem a diákok nem sorrendben követik egymást az input sorokbam
            s = sor.split(":");      //ketté vágom a sort
            iz[i] = new Izzaszto(s[0], Integer.parseInt(s[1]));    //saját neve; előzőNeve
        }
        System.out.println();
        
        for (int i=0; i<n;i++){
            if(iz[i].getNev().compareTo(v) ==0) {
                for(i=0;i<n-1;i++){
                    for (int j=1;j<n;j++)
                        if (iz[j].getHom() > iz[i].getHom() ){
                        Izzaszto tmp = iz[i];
                        iz[i]=iz[j];
                        iz[j]=tmp;}
                        else if( iz[j].getHom() == iz[i].getHom() ){
                                    if (iz[i].getNev().compareTo(iz[j].getNev()) >0){
                        Izzaszto tmp = iz[i];
                        iz[i]=iz[j];
                        iz[j]=tmp;
                                }
                    }
                }
            }
            else {
                System.out.println("Missing Data");    
            }
        }
        for ( int i=0;i<iz.length;i++){
            if (iz[i].getHom()>n){
                System.out.println(iz[i].getNev() +"("+ iz[i].getHom()+")");
            }
        }
    }
}
