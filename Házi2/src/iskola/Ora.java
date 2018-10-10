package iskola;

public class Ora {
    private int okod;
    private String onev;
    private int okezd;

    public Ora(int okod, String onev, int okezd) {
        this.okod = okod;
        this.onev = onev;
        if (this.okezd<8){
            this.okezd=8;
        }
        if (this.okezd>19){
            this.okezd=19;
        }else{
             this.okezd=okezd;
         }
    }

    public int getOkod() {
        return okod;
    }

    public void setOkod(int okod) {
        this.okod = okod;
    }

    public String getOnev() {
        return onev;
    }

    public void setOnev(String onev) {
        this.onev = onev;
    }

    public int getOkezd() {
        return okezd;
    }

    public void setOkezd(int okezd) {
        this.okezd = okezd;
    }

    @Override
    public String toString() {
        return "Ora{" + "okod=" + okod + ", onev=" + onev + ", okezd=" + okezd + '}';
    }
    
    
    
    
}
