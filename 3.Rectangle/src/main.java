public class main {
         
    public static void main(String[] args) {
        
        Rectangle r1= new Rectangle(3.5, 35.9);
        
        Rectangle r2 = new Rectangle(4, 40);
        
        System.out.println("r1 height: " + r1.getHeight());
        System.out.println("r1 T: "+r1.getArea());
        System.out.println("r1 K: "+r1.getPerimeter());
        System.out.println("r2 height: " + r2.getHeight());
        System.out.println("r2 T: "+r2.getArea());
        System.out.println("r2 K: "+r2.getPerimeter());
}}