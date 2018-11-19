/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat11;

/**
 *
 * @author Pig
 */
public class Személy {
     protected String név; 
     protected int életkor; 
     private boolean férfi; 

    public Személy(String név, int életkor, boolean férfi) {
        this.név = név;
        this.életkor = életkor;
        this.férfi = férfi;
    }

    public String getnév() {
        return név;
    }

    public void setnév(String név) {
        this.név = név;
    }

    public int getéletkor() {
        return életkor;
    }

    public void setéletkor(int életkor) {
        this.életkor = életkor;
    }

    public boolean isférfi() {
        return férfi;
    }

    public void setférfi(boolean férfi) {
        this.férfi = férfi;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return   "Szemely:"+sb.append(név + " " + életkor + " " + férfi);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null||(obj instanceof Személy))
            return false;
        Személy sz=(Személy)obj;
        return this.életkor == sz.életkor;
    }
     
     
}
