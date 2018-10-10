
package VendéglátóE;

public class Kocsma extends VendéglátóipariEgység {
    
    private String sörlap;

    public Kocsma(String sörlap, String név, int férőhelyekSzáma) {
        super(név, férőhelyekSzáma, true);
        this.sörlap = sörlap;
    }

    @Override
    public String toString() {
        return "Kocsma{" + "s\u00f6rlap=" + sörlap + '}';
    }
    
    
}
