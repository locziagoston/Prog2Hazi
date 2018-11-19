/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zarthelyi;
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
        
        List<Zarthelyi> zh=new ArrayList();
        
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        int tomb=0;
        int x;
        while(sor.length()>0) {
            String [] st=sor.split(";");
            x=0;
            if(tomb==0) {
                zh.add(new Zarthelyi(st[0], Integer.parseInt(st[1])));
                tomb++;
            }
            else {
                Zarthelyi v=new Zarthelyi(st[0], Integer.parseInt(st[1]));
                for(int i=0;i<zh.size();i++) {
                    if(zh.get(i).getNév().compareTo(st[0])==0) {
                        x++;
                        int p=zh.get(i).pont;
                        v.pont=v.pont+p;
                        zh.set(i, v);
                    }
                }
                tomb++;
                if(x==0){
                    zh.add(v);
                }  
            }
            sor=sc.nextLine();
        }
        Collections.sort(zh);
        for (Zarthelyi y : zh) {
            System.out.println(y);
        }
        
    }
    
}
    
