package BpKupa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
   private static BpKupa[] k[];
   
   
    public static void main(String[] args) {
        DateFormat dateform;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++){
            String sor =sc.nextLine();
            String s[] = sor.split(";");
            dateform = new SimpleDateFormat("YYYY;MM;dd");
            Date bpdatum = new Date();
            
            
        }
        
    }
    
}
