public class Pont {
    private double x;
    private double y;

    public Pont(double x, double y) {
        this.x = x;
        this.y = y;
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
    
     public double setYplusFive(double y){
         return this.getY()+5;
     }
     
     public double setXMulti (double x){
         return this.getX()*3.4;
     }
    
    
}
