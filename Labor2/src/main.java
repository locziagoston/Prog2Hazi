/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class main {
    
    
    
    public static int lnko(int a, int b)
    {
        int r;
        do{
            r=a%b;
            a=b;
            b=r;
            
            
        }while(r!=0);
        return a;
    }
    
    public static boolean palindrom(int szam)
    {
        int másolat=szam;
        int újszám=0;
        while(szam>0){
            int szj=szam%10;
            újszám=újszám*10+szj;
            szam=szam/10;
        }
        return újszám==másolat;
    }
            
    public static void main(String[] args) {
//        
//        Rectangle r1= new Rectangle();
//        
//        Rectangle r2 = new Rectangle(2, 3.5);
//        double r3=4;
//        System.out.println(r3);
//        
//        System.out.println(r1);
//        System.out.println(" A téglalap területe"+r2.getArea());
//        System.out.println(" A téglalap kerülete"+r2.getPerimeter());
//        System.out.println(r2.getHeight()); //azért kell így mert privát a height
//        r2.setHeight(17);
//        System.out.println(r2.getHeight()); //getterekkel setterekkel tudjuk manipulálni a private változókat
//    }
//}
//    QEquation e1 = new QEquation(1, 2, 3);
//    QEquation e2 = new QEquation(2, 4, 1);
//                 System.out.println("x1="+e1.getRoot1()+" "+e1.getRoot2());
//              System.out.println("x1="+e2.getRoot1()+" "+e2.getRoot2());
//              System.out.println(e1);
//    
//        Account ac;
//        
//        System.out.println(Account.getAnnualTR()); //az osztály szintű adattagokra és metódusokra az osztály nevével és . operátorral hivatkozunk
//        
        /*Account ac1 = new Account(1, 10000);
        System.out.println("Id: "+ac1.getId()+" Egyenleg: "+ac1.getBalance());
        Account ac2 = new Account(2, 20000);
        System.out.println("Id: "+ac2.getId()+" Egyenleg: "+ac2.getBalance());
        Account ac3 = new Account(3, 30000);
        System.out.println("Id: "+ac3.getId()+" Egyenleg: "+ac3.getBalance());
        
        
        ac1.deposit(2000);
        System.out.println("Id: "+ac1.getId()+" Egyenleg: "+ac1.getBalance());
        
        ac1.withdraw(10000);
        System.out.println("Id: "+ac1.getId()+" Egyenleg: "+ac1.getBalance());
        */
        final double pi=3.14;
        
        System.out.println(Fan.MEDIUM);
        Fan f = new Fan();
        System.out.println(f);
        f.setOn(true);
        f.setSpeed(Fan.FAST);
        System.out.println(f);
        
        System.out.println(Math.PI);
        System.out.println(lnko(360,225));
    }
}