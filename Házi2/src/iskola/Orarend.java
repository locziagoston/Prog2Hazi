
package iskola;

public class Orarend {
    private String nap;
    private String[] ora;
    private int szamlalo;

    public Orarend(String nap) {
        this.nap = nap;
        this.szamlalo =0;
        ora = new String[12];
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public String[] getOratomb() {
        return oratomb;
    }

    public void setOratomb(String[] oratomb) {
        this.oratomb = oratomb;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", oratomb=" + oratomb + ", szamlalo=" + szamlalo + '}';
    }   
    
    public boolean oratHozzaad(Ora or){
        if (this.szamlalo >=12){
        return false;
        }
        else{
             for(int i=0;i<=this.szamlalo;i++) {
                 if(this.ora[i].getOkezd()==or.getOkezd()){
                     return false;
                 }
                 
            }
        this.ora[this.szamlalo]=or;
        this.szamalo++;
        return true;
        }
    }
}
