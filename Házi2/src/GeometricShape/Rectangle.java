package GeometricShape;

import java.util.Date;

public class Rectangle extends GeometricShape {
    
    private double width;
    private double height;

    public Rectangle(double width, double height, String color, boolean fillet) {
        super(color, fillet);
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea()
    {
     return this.height*this.width;   
    }
    
    public double getPerimeter()
    {
        return 2*(this.height+this.width);
    }
}
