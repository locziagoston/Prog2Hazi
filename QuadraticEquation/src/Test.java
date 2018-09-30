public class Test {
    public static void main(String[] args) {
        QuadraticEquation q1 = new QuadraticEquation(1,2,3);
        QuadraticEquation q2 = new QuadraticEquation(2,3,4);
        QuadraticEquation q3 = new QuadraticEquation(3,4,5);
        
        //q1
            if (q1.getDiscriminant()>0){
                 System.out.println(q1.getRoot1() + ", " + q1.getRoot2());
            }
            if (q1.getDiscriminant()<0){
                 System.out.println("The equation has no roots");
            }
            else {
                System.out.println(q1.getRoot1());
            }
        //q2
            if (q2.getDiscriminant()>0){
                 System.out.println(q2.getRoot1() + ", " + q2.getRoot2());
            }
            if (q2.getDiscriminant()<0){
                 System.out.println("The equation has no roots");
            }
            else {
                System.out.println(q2.getRoot1());
            }
        //q3
            if (q3.getDiscriminant()>0){
                 System.out.println(q3.getRoot1() + ", " + q3.getRoot2());
            }
            if (q3.getDiscriminant()<0){
                 System.out.println("The equation has no roots");
            }
            else {
                System.out.println(q3.getRoot1());
            }
           
    }
   }

