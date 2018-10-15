
package katona;


public class Nyilas extends Katona {
    private int lotav;

    public Nyilas(int lotav) {
        this.lotav = lotav;
    }

    public Nyilas(int lotav, int attack, int def) {
        super(attack, def);
        this.lotav = lotav;
    }
    
    

    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }
    
    public int Tamadoero(int a, int b){
        return this.lotav+getAttack();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.lotav;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Nyilas)){
        return false;}
        Nyilas x = (Nyilas) obj;
        return getAttack()==(x.getAttack()) && getDef()==(x.getDef()) && this.lotav==(x.getLotav());
    }
    
    @Override
    public String toString() {
        return "Nyilas: TE: "+super.getAttack()+", VE: "+super.getDef();
    }
    
}
