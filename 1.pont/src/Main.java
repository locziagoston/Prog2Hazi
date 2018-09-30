public class Main {
    
    public static void main(String[] args) {
        //1. FELADAT (Pont.java)
        Pont p1 = new Pont(2.5, 3);
        Pont p2 = new Pont(4, 3.5);
        Pont p3 = new Pont(2.8, 1);
        Pont p4 = new Pont(1.5, 0);
        System.out.println(p1.setYplusFive(0));
        System.out.println(p2.setYplusFive(0));
        System.out.println(p3.setXMulti(0));
        System.out.println(p4.setXMulti(0));
    }
}
