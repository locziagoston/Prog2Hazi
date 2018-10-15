package Hullamvasut;

public class Hullamvasut {
    
    private String nev;
    private String vnev;
    private int magassag;
    private int idő;

    public Hullamvasut(String nev, String vnev, int magassag, int idő) {
        this.nev = nev;
        this.vnev = vnev;
        this.magassag = magassag;
        this.idő = idő;
    }

    public String getNev() {
        return nev;
    }

    public String getVnev() {
        return vnev;
    }

    public int getMagassag() {
        return magassag;
    }

    public int getIdő() {
        return idő;
    }
    @Override
    public String toString() {
        return "Hullamvasut{" + "nev=" + nev + ", vnev=" + vnev + ", magassag=" + magassag + ", id\u0151=" + idő + '}';
    }
    
}
