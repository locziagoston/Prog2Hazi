package GeometricShape;


import java.util.Date;


public class GeometricShape {
    private String color;
    private boolean fillet;
    private Date dateCreated;
    
    public GeometricShape(){
        this.color = "white";
        this.fillet = true;
        this.dateCreated = new Date();
    }
    
    public GeometricShape(String color, boolean fillet) {
        this.color = color;
        this.fillet = fillet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFillet() {
        return fillet;
    }

    public void setFillet(boolean fillet) {
        this.fillet = fillet;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricShape{" + "color=" + color + ", fillet=" + fillet + ", dateCreated=" + dateCreated + '}';
    }
    
   
}
