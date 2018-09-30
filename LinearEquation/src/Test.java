public class Test {
    public static void main(String[] args) {
        LinearEquation L1 = new LinearEquation(1, 2, 3, 8, 5, 6);
        LinearEquation L2 = new LinearEquation(6, 2, 5, 4, 0, 6);
        LinearEquation L3 = new LinearEquation(2, 3, 10, 4, 9, 7);
        
        System.out.println(L1.getX());
        System.out.println(L1.getY());
        if(L1.isSolvable()){
            System.out.println("The equation has no solution");
        }
        
        System.out.println(L2.getX());
        System.out.println(L2.getY());
        if(L2.isSolvable()){
            System.out.println("The equation has no solution");
        }
        
        System.out.println(L3.getX());
        System.out.println(L3.getY());
        if(L3.isSolvable()){
            System.out.println("The equation has no solution");
        }
}
    
}
