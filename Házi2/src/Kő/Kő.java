package Kő;
import java.util.Random;
import java.util.Scanner;

public class Kő {

    public static void main(String[] args) { 
        String jel;
        String gépjel = "";
        int rnd;

        Scanner sc = new Scanner(System.in); 
        Random generator = new Random(); 
        rnd = generator.nextInt(3)+1; 

                switch (rnd) {
                    case 1:
                        gépjel = "Kő";
                        break;
                    case 2:
                        gépjel = "Papír";
                        break; 
                    case 3:
                        gépjel = "Olló";
                        break;
                    default:
                        break;
                }
        jel = sc.nextLine();

        if (jel.equals(gépjel)) 
            System.out.println("Döntetlen"); 
        else if (jel.equals("Kő")) 
           if (gépjel.equals("Olló")) 
            System.out.println("Nyertél");
        else if (gépjel.equals("Papyr")) 
            System.out.println("Vesztettél"); 
        else if (jel.equals("Papír")) 
           if (gépjel.equals("Olló")) 
            System.out.println("Vesztettél"); 
        else if (gépjel.equals("Kő")) 
            System.out.println("nyertél"); 
        else if (jel.equals("Olló")) 
             if (gépjel.equals("Papír")) 
            System.out.println("nyertél"); 
        else
            System.out.println("Vesztettél");
    }
   }

