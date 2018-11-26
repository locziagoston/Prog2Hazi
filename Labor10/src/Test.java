/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Test {
    
    public static void main(String[] args) {
//        int a=0;
//        try{
//            //a = 3/0;
//            System.out.println("Az osztas alatt");
//            System.out.println(a);
//        int t[]= new int[]{1,2,3,4,5};
//        //System.out.println(t[10]);
//        }catch(ArithmeticException e)
//        {
//            a = 1;
////            e.printStackTrace();
//        }catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("túlindexeltük");
//
//        }catch(Exception e)
//        {
//        
//            System.out.println("minden kivételt elkap");
//        }finally{
//            System.out.println("a finally minden esetben lefut");
//            
//        }
        
        try{
            URLcím u= new URLcím("htt://www.inf.unideb.hu.");
        }catch(URLcímException e)
        {
            e.printStackTrace();
        }


        //System.out.println("a main utolso sora ");
    }
    
}
