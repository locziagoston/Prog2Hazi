
package Izzaszto;

public class Izzaszto {
    private String nev;
    private int hom;

    public Izzaszto(String nev, int hom) {
        this.nev = nev;
        this.hom = hom;
    }

    public String getNev() {
        return nev;
    }

    public int getHom() {
        return hom;
    }

    @Override
    public String toString() {
        return nev + ":" + hom;
    }

}
