
package MasfelMillio;

public class Mml {
    private String nev;
    private String ut;

    public Mml(String nev, String ut) {
        this.nev = nev;
        this.ut = ut;
    }

    public String getNev() {
        return nev;
    }

    public String getUt() {
        return ut;
    }

    @Override
    public String toString() {
        return  nev;
    }
    
    
}
