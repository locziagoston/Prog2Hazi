import static java.lang.Math.tan;

public class RegularPolygon {
    private int n; //oldalszám
    private double side; //oldalhossz
    private double x; //középpont x kordinátája
    private double y; //középpont y kordinátája
    
    public RegularPolygon()
    {
        this.n=3;
        this.side=1;
        this.x=0;
        this. y=0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPerimeter()
    {
        return this.side*this.n;
    }
    public double getArea()
    {
        return 0.25*this.n*this.side*this.side*(1/(tan(3.1413/this.n)));
    }

    @Override
    public String toString() {
        return "RegularPolygon\n" + "oldalainak száma: " + n + "\noldalanak hossza: " + side + "\nkozeppont x koordinataja: " + x + "\n kozeppont y koordinataja : " + y + "\n";
    }
    
}
