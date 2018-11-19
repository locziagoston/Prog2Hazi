/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

/**
 *
 * @author Pig
 */
public class Main {
    public static Aszu[] puttony(Bor [] bor){                
        int db=0;
        Aszu[] k=new Aszu [db];                     
        int index=0;
        
        for(int i=0;i<bor.length;i++){                
            if(bor[i] instanceof Aszu) {                      
                Aszu a = (Aszu)bor[i];                         
                if(a.getPuttonySzam()== 5) {
                    db++;                                
                }
            }
        }
        
        for(int i=0;i<bor.length;i++){
            if(bor[i] instanceof Aszu) {
                Aszu a = (Aszu)bor[i];
                if(a.getPuttonySzam()==5) {
                    k[index]=a;                        
                    index++;                                
                }
            } 
        }
        return k;
    }
    
    public static void main(String[] args) {
        
        Bor [] bor=new Bor []{
            new Bor("vörös","100","félédes",4),
            new Aszu(6,"110",5),};
    
            Aszu[] t=puttony(bor);                      
            for (Aszu a : t){
                System.out.println(a);
             }

        
    }
    
   
}
