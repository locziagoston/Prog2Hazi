/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Rectangle {
    public double width; //itt még nem adjuk meg az értéket
    private double height;
    
    public Rectangle()
    {
        this.width=1.0;
        this.height=1.0;
    }

    public Rectangle(double width, double height) { // alt+insert
        this.width = width;
        this.height = height;
    }
    
    public double getArea()   // get -> valamit meg tud mondani a függvény itt:terület, kerület
    {
     return this.height*this.width;   
    }
    
    public double getPerimeter()
    {
        return 2*(this.height+this.width);
    }

    @Override //alt+insert toString
    public String toString() {
        return "Rectangle\n" + "[width=" + width + "\nheight=" + height + "]";
    }
    public double getHeight()
    {
    return this.height;
    }
    
    public void setHeight(double h)
    {
        this.height=h;
        
    }
    
}
