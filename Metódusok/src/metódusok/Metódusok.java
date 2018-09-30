package metódusok;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Arrays;

public class Metódusok {

     public static void     f1(int a, int b, int c)
    {
        int n[]={a, b, c};
        Arrays.sort(n);
        for (int i=0; i<3; i++)
        {
            System.out.println(n[i]);
        }
    }
    
     public static void     f2(double a, double b, double c){
        if(a<b && a<c){
            System.out.println("min:" + a);
        }
        if(b<a && b<c){
            System.out.println("min:" + b);
        }
        if(c<b && c<a){
            System.out.println("min:" + c);
        }
        
        if(abs(b)<abs(a) && abs(c)<abs(a)){
            System.out.println("absmax:" + abs(a));
        }
        if(abs(a)<abs(b) && abs(c)<abs(b)){
            System.out.println("absmax:" + abs(b));
        }
        if(abs(b)<abs(c) && abs(a)<abs(c)){
            System.out.println("absmax:" + abs(c));
        }
        
    }
     
     public static void     f3(double a, double b, double c, double d){
        System.out.println(a +", "+ b +", "+ c +", "+ d);
        if(d>=0){
            System.out.println(a +", "+ c +", "+ b +", "+ d);
        }
        else{
            System.out.println(a +", "+ b +", "+ d +", "+ c);
        }
    }
     
     public static boolean  f4(double a, double b, double c){
         if(a<0 || b<0 || c<0){
             System.out.println("Az érték nem lehet negatív!");
             return false;
         }
         else{
             if(a<b+c && b<a+c && c<a+b){
                 System.out.println("Megszerkeszthető.");
                 return true;    
             }else{
                 System.out.println("Nem szerkeszthető meg.");
                 return false;
             }
         }
    }
     
     public static int      f5(int a, int b){
         int db=0;
         if(a>=0 && b>=0 && a<b){
            for(int i=a; i<=b; i++){
                if((i%4==0 && i%100!=0) || i%400==0){
                    db++;
                }
            }
         }
         System.out.println(db);
         return db;
     }
     
     public static void     f6(int a){
         switch (a) {
            case 1:  System.out.println("Elégtelen"); break;
            case 2:  System.out.println("Elégséges"); break;
            case 3:  System.out.println("Közepes"); break;
            case 4:  System.out.println("Jó"); break;
            case 5:  System.out.println("Kiváló"); break;
         }
     }
     
     public static double    f7(int a, int b){
         int hanyados=0;
         for (int i=0; i<a; i++){
             if(a>0){
                 a=a-b;
                 ++hanyados;
             }
         }
         System.out.println(hanyados);
         return hanyados;
    }
     
     public static void     f8(int a){
        for(int i=2; i<sqrt(a);i++){
            if(a%i==0){
                System.out.println("Összetett szám");
                break;
            }
            else{
                System.out.println("Prímszám");
            }
        }
    }
     
     public static void     f9(int n){
        int a = 0;
        int b = 1;
        int c;
        if(n==1){
            System.out.println(a);
        }
        else{
            if(n==2){
            System.out.println(a +"\n"+ b);
            }
            else{
                c=a+b;
                System.out.println(a +"\n"+ b +"\n"+ c);
                int k=3;
                while (k<n){
                    a=b; b=c; c=a+b;
                    System.out.println(c);
                    k=k+1;
                }
            }
        }
        
    }
     
     public static int      f10(int n) {
        int uj=0;
        while(n!=0){
            uj=uj*10+(n%10);
            n=n/10;
        }
         System.out.println(uj);
         return uj;
    }
     
     public static int      f11(int a){
         int faktorialis=1;
        for(int i=1;i<=a;i++){
            faktorialis*=i;
        }
         System.out.println(faktorialis);
        return faktorialis;
    }
     
     public static void     f12(int n1, int n2, int oszto){
         int osztok;
         if(n1>n2){
             int tmp;
             tmp=n1;
             n1=n2;
             n2=tmp;
         }
          for (int i=n1; i<n2; i++){
                if(i%oszto==0){
                    System.out.println(i);
                }
         }
    }
     
     public static void     f13(int n){
        int a = 0;
        int b = 1;
        int c;
        if(n==0 || n==1 || n==2){
            System.out.println(n+1);
        }
        else{
             c=a+b;
             int k=3;
             while (c<=n){
                 a=b; b=c; c=a+b;
                 k=k+1;
             }
             System.out.println(c);
        }
    }
     
     public static void     f14(){
        for(int i=0;i<1000;i++){
            int x;
            x=i;
            int sum=0;
            while(x!=0){
                sum+=pow(x%10, 3);
                x/=10;
            }
            if(sum==i){
                System.out.println(sum);
            }
        }
    }
    
    public static void main(String[] args) {
        //f1(3, 0, 2);
        //f2(-3, 0, 2);
        //f3(-1, 0, 2.5, 4);
        //f4(2, 3, 4);
        //f5(1980, 2000);
        //f6(2);
        //f7(100, 33);
        //f8(11);
        //f9(10);
        //f10(422);
        //f11(3);
        //f12(20, 100, 3);
        //f13(10);
        //f14();
    }
    
}
