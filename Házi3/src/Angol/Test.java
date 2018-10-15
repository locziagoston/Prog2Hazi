
package Angol;
import java.util.Scanner;

public class Test {
    public static Angol[] ang;
    
    public static void Rendez(Angol[] a){
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length;j++){
                if(a[i].getEng().equals(a[j].getEng())){
                    if(a[i].getHun().compareTo(a[j].getHun())>0){
                        Angol tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }else{
                    if(a[i].getEng().compareTo(a[j].getEng())>0){
                        Angol tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }
        }
        
    }
    public static void Kiir(Angol[] a){
        for (int i = 1; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        String[] s = sor.split(":");
        int n = Integer.parseInt(s[0]);
        
        for (int i = 1; i < n; i++) {
            sor = sc.nextLine();
            s = sor.split(":");
            ang[i] = new Angol(s[0],(s[1]));
        }
        System.out.println();
    }    
}
