/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katona;

public class Test {
    public static Katona megkuzd(Katona ny, Katona l){
        if(ny.getAttack()>l.getDef()){
        return l;
        }
        if(l.getAttack()>ny.getDef()){
            return ny;
        }else{
                    return ny;
        }
    }
    
    public static void main(String[] args) {
        Katona k1 = new Katona(1,2);
        Katona k2 = new Katona(2,3);
        Katona k3 = new Katona(3,1);
        System.out.println(megkuzd(k3,(megkuzd(k1,k2))));
    }
}
