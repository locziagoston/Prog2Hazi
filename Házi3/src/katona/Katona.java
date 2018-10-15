
package katona;

public class Katona {
    
    private int attack;
    private int def;
    
    public Katona(){
    this.attack= 5;
    this.def= 5;
    }

    public Katona(int attack, int def) {
        this.attack = attack;
        this.def = def;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return "attack: " + attack + ", defense: " + def;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.attack;
        hash = 53 * hash + this.def;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Katona)){
        return false;
        }
        Katona k = (Katona) obj;
        return this.attack==(k.getAttack()) && this.def==(k.getDef());
    }
    
    
}
