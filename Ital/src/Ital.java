
import java.util.Date;
import java.util.Objects;

public class Ital {

    protected String név;
    protected String kiszerelés;
    private static int ár=10;
    protected Date gyártásiDátum;
    public static final int EURO=320;

    public Ital(String név, String kiszerelés, Date gyártásiDátum) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = new Date();
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public static int getÁr() {
        return ár;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    @Override
    public String toString() {
        return név + ", " + kiszerelés + " dl, " + ár + "Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.kiszerelés);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        if (!Objects.equals(this.kiszerelés, other.kiszerelés)) {
            return false;
        }
        if (!Objects.equals(Ital.ár, Ital.ár)) {
            return false;
        }
        return true;
    }
    
    public double getÁrEuróban(){
        return ár/EURO;
    }
    
    
    
    
}
