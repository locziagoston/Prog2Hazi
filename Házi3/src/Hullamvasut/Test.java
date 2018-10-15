
package Hullamvasut;

import java.util.Scanner;

public class Test{
    public static Hullamvasut[] h;
    
    public static void kiir(Hullamvasut[] h) {
        for(int i=0;i<h.length;i++){
            System.out.println(h[i]);
        }
    }
    
    public static void rendez(Hullamvasut[] hm) {
        for(int i=0;i<hm.length-1;i++){
            for(int j=1;i<hm.length;j++){
                if (h[i].getIdő()>h[j].getIdő()){
                    Hullamvasut tmp = hm[i];
                    h[i]=h[j];
                    h[j]=tmp;
                } else if(h[i].getIdő()==h[j].getIdő()){
                    if (h[i].getMagassag()<h[j].getMagassag()){
                        Hullamvasut tmp = hm[i];
                        h[i]=h[j];
                        h[j]=tmp;
                    }else if (h[i].getNev().compareTo(h[j].getNev()) >0){
                        Hullamvasut tmp = hm[i];
                        h[i]=h[j];
                        h[j]=tmp;
                    }
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in); //szam beolvas
     String ss = sc.nextLine();   //az ertekent eltaroljuuk szam valtozoba
     int n = Integer.parseInt(ss); //a string szamjegyet intre kovertaljuk
     h = new Hullamvasut[n];
    
        for (int i=0;i<n;i++){
            String sor = sc.nextLine();
            String[]s = sor.split(";");
            h[i] = new Hullamvasut(s[0], s[1], Integer.parseInt(s[2]), Integer.parseInt(s[3]));

        }
        System.out.println();
        
    }
}
