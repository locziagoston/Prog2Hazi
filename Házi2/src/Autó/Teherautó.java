
package Autó;

import java.util.Date;


public class Teherautó extends Autó {
    
    private int maxSzállíthatóTeher;

    public Teherautó(int maxSzállíthatóTeher, String rendszám, int MotorTeljesítmény) {
        super(rendszám, MotorTeljesítmény);
        this.maxSzállíthatóTeher = maxSzállíthatóTeher;
    }

   

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public String toString() {
        return "Teheraut\u00f3{" + "maxSz\u00e1ll\u00edthat\u00f3Teher=" + maxSzállíthatóTeher + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.maxSzállíthatóTeher;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Teherautó))
        {
            return false;
        }
        Teherautó x = (Teherautó) obj;
        return this.maxSzállíthatóTeher==(x.getMaxSzállíthatóTeher());
    }
    
    
    
}
