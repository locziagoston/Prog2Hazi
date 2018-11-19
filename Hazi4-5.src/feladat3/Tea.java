/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;

/**
 *
 * @author Pig
 */
public class Tea implements Rendezheto<Tea> {   
    public String nev;   
    public int ár;   
    
    
    public Tea(String s,int j) {    
        nev=s;    
        ár=j;    
    } 

    @Override
    public boolean egyenlo(Tea o) {
        if(this.ár==o.ár) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean nagyobbMint(Tea o) {
        if(this.ár>o.ár) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean kisebbMint(Tea o) {
        if(this.ár<o.ár) {
            return true;
        }
        else {
            return false;
        }
    }

} 

