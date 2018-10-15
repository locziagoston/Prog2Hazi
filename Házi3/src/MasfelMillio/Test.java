
package MasfelMillio;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        Mml[] m = new Mml[n];
        for (int i=0;i<n;i++){
             String sor =sc.nextLine();
             String s[] = sor.split(";");
             m[i] = new Mml(s[0],s[1]);
             int kek=0;
             int tobbi=0;
             String ut = m[i].getUt();
              for (int j=0; j<ut.length()-1; j++){
                if (s[1].charAt(j)=='K'){
                    kek++;
                }
                if (s[1].charAt(j)=='P' || s[1].charAt(j)=='S' || s[1].charAt(j)=='Z'){
                    tobbi++;
                }
            }  
        }
        for (int i=0;i<n;i++){
        System.out.println(m[i].getNev());
        }
    }
}
