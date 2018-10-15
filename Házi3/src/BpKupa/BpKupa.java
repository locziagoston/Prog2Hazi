package BpKupa;

import java.util.Date;

public class BpKupa {
    private String datum;
    private String nev;
    private int rtav;

    public BpKupa(String datum, String nev, int rtav) {
        this.datum = datum;
        this.nev = nev;
        this.rtav = rtav;
    }

    public String getDatum() {
        return datum;
    }

    public String getNev() {
        return nev;
    }

    public int getRtav() {
        return rtav;
    }

    @Override
    public String toString() {
        return datum + ";" + nev;
    }

    
}
