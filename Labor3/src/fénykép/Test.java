package fénykép;

import java.util.Scanner;

public class Test {
        
    private static fényképezőgép fnyg[];
    
    private static int hegyekSzáma(fényképezőgép fg){
                String findString="/\\";
                int firstIndex=0;
                String str=fg.getFénykép();
                int count=0;
                while (firstIndex!=-1){
                    firstIndex=str.indexOf(findString, firstIndex);
                    if (firstIndex!=-1){
                        count++;
                        firstIndex=firstIndex+findString.length();
                    }
                }
                return count;
    }
    
    private static void rendez(fényképezőgép[] t){
        for(int i=0;i<t.length-1;i++){
            for (int j=i+1;j<t.length;j++){
                if(t[i].getFénykép().length()<t[j].getFénykép().length()){
                    fényképezőgép tmp =t[i];
                    t[i]=t[j];
                    t[j]=tmp;
                }
                else if(t[i].getFénykép().length()==t[j].getFénykép().length()){
                    if (hegyekSzáma(t[i])==hegyekSzáma(t[j])){
                        if (t[i].getMárka().compareTo(t[j].getMárka())>0){
                            fényképezőgép tmp =t[i];
                            t[i]=t[j];
                            t[j]=tmp;
                        }
                    } else if(hegyekSzáma(t[i])<hegyekSzáma(t[j])){
                            fényképezőgép tmp =t[i];
                            t[i]=t[j];
                            t[j]=tmp;
                    }
                  
                }
            }
        }
    }
    
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