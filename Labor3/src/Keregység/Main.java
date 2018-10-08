package Keregység;

import java.util.Date;

public class Main {
    
    private static Pékség[] adottPékárutÁrusítóP(String psüti, Keregység[] ker){
        int count=0;
        
        for(int i=0;i<ker.length;i++){
            if(ker[i] instanceof Pékség){
                Pékség p=(Pékség)ker[i];
                for(int j=0;j<p.getPékÁruk().length;j++){
                    if(p.getPékÁruk()[j].equals(psüti)){
                     count++;
                    }
                }
            }
        }
        int k=0;
        Pékség[] pékség = new Pékség[count];
        for(int i=0;i<ker.length;i++){
            if(ker[i] instanceof Pékség){
                Pékség p=(Pékség)ker[i];
                for(int j=0;j<p.getPékÁruk().length;j++){
                    if(p.getPékÁruk()[j].equals(psüti)){
                     pékség[k]=p;
                     k++;
                    }
                }
            }
        }
        return pékség;
    }
    
    public static void main(String[] args) {
        Keregység [] ker = new Keregység[] {
            new Pékség("Aranycipó", "Egy. 1", new Date(), new String[]{"kifli","pogácsa","kenyér"}),
            new Pékség("Spar", "Egy. 2", new Date(), new String[]{"kifli","pogácsa","Kakoscsiga"}),
            new Dohánybolt("Ronson","Egy. 3", new Date(), new String[]{"Kent","Bond"}),
            new Pékség("buci", "Egy. 4", new Date(), new String[]{"zsemle","pogácsa","kenyér"})
        };
        
        Pékség[] pék = adottPékárutÁrusítóP("kenyér", ker);
        for(Pékség p:pék){
            System.out.println(p);
        }
    }
}
