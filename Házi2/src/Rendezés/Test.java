
package Rendezés;

import java.util.Random;

public class Test {
    
    public static void main(String[] args) {
        
        Random rnd = new Random();
        int[] t = new int[30];              //létrehozunk egy t 30 elemű tömböt
        for (int i = 0; i < t.length; i++) { //feltötltjük random számokkal
            t[i] = rnd.nextInt(10);
        }
        printArray(t);                      //tömb kiiratás
        long timeStart = System.currentTimeMillis();
        insertionSort(t);
        long timeEnd = System.currentTimeMillis();
        printArray(t);
        System.out.println(timeEnd - timeStart);
        
        }
    
    static void printArray(int[] a) {
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
    }
        
    static void insertionSort(int[] a) {
        // Write your code here.
        for (int i=1;i<30;++i){
            int tmp = a[i];
            int j = i-1;
            while(j>=0 && a[j]>tmp)
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=tmp; 
        } 
    }
    
}
