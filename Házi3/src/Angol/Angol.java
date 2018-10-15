package Angol;

public class Angol {
    private String eng;
    private String hun;

    public Angol(String eng, String hun) {
        this.eng = eng;
        this.hun = hun;
    }

    public String getEng() {
        return eng;
    }

    public String getHun() {
        return hun;
    }

    @Override
    public String toString() {
        return eng + ":" + hun;
    }
    
    
}
