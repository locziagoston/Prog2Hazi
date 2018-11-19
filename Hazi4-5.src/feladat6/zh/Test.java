/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat6.zh;

import java.util.Scanner;

/**
 *
 * @author Pig
 */
public class Test {
     public static void main(String[] args) {
    int a;
        Scanner beker=new Scanner(System.in);
        a=Integer.parseInt(beker.nextLine());  
        h= new Hallgato[a];
        
        for(int i=0;i<a;i++){
            String sor=beker.nextLine();
            String st[]=sor.split(" "); 
            h[i]= new Hallgato(Integer.parseInt(st[0]),Boolean.parseBoolean(st[1]));
        }
        
        for(Hallgato x: h){
            if(x.dolgozatotIr().megfelelt()&&x.dolgozatotIr().megfelelt())
                System.out.println("megfelelt");
            else System.out.println("nem felelt meg");
        }
        
    }
    private static feladat6.zh.Hallgato h[];
    
}
