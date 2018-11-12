
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Színész implements Comparable<Színész> {
    private String név;
    private List<Film> film;

    public Színész(String név) {
        this.név = név;
        this.film = new ArrayList<>();
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public List<Film> getFilm() {
        return film;
    }

    public void setFilm(List<Film> film) {
        this.film = film;
    }

    @Override
    public int compareTo(Színész o) {
        return (-1)*Integer.compare(this.film.size(), o.getFilm().size()); //(-1)* a sorrendet megfordítjuk
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.név).append(":\n"); //sortot akkor használhatjuk ha van compareto-ja
        Collections.sort(film); 
        for(int i=0;i<film.size();i++)
            if(i<film.size()-1)
            sb.append(film.get(i)).append('\n');
            else
                sb.append(film.get(i));
        return sb.toString();
        
    }
    
    
    
    
    
}
