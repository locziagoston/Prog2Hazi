
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Teszt {
    
    public static void rendez(List l){
        
        for(int i=0;i<l.size();i++)
            for(int j=i+1;j<l.size();j++)
                if(l.get(i)instanceof Hasonlítható && l.get(j) instanceof Hasonlítható){
                    if((((Hasonlítható)l.get(i)).hasonlít((Hasonlítható)l.get(j))) <0)
                    {
                        Hasonlítható tmp;
                        tmp=(Hasonlítható)(l.get(i));
                        l.set(i, l.get(j));
                        l.set(j, tmp);
                    }
                }
                else
                {
                    throw new ClassFormatError();
                }
        
    }
    
    public static void main(String[] args) {
        
        List<Hallgató> li = new ArrayList();
        List<Senki> li2  = new LinkedList();
        li.add(new Hallgató("ASDAD",2.3,"DSA ADEL", 1234));
        li.add(new Hallgató("SGGRE",2.1,"QWE ODON", 1934));
        li.add(new Hallgató("WWWDAD",4.3,"BÉLA", 2234));
        
        //System.out.println(li.get(2));
        li.set(0,new Hallgató("GHNK", 2.7,"Vicc Elek",2111));

        System.out.println(li.isEmpty());
        //System.out.println(li.remove(0));
        
        //li.remove(0);
        
        //Collections.sort(li);
        
        System.out.println("Eredet: ");
        for(Hallgató i:li){
            System.out.println(i);
        }
        rendez(li);
        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }
        li2.add(new Senki(2));
        li2.add(new Senki(5));
        
        //rendez(li2);
        Collections.sort(li);
    }
    
}
