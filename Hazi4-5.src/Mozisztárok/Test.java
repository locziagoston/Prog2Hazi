package Mozisztárok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Film> f = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        String sor = sc.nextLine();
        
        while(sor.length()>0){
            String [] d=sor.split("[:();]");
            
            for(int i=3;i<d.length;i++){
                Film fn = new Film(d[i]);
                if(f.contains(fn)){
                    f.get(f.indexOf(fn)).getSzinesz().add(new Szinesz(d[0],Integer.parseInt(d[1])));
                }
            }
        }
    }
}

