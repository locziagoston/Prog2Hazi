
package Mintakeresés;

public class Main {
    
    public static boolean isConsecutiveFour(int[] values){
        int streak=0;
        for (int i=0;i<(values.length)-3;i++){
            if (values[i]==values[i+1]){
                streak++;
            }else{
            streak=0;
            }
            if (streak==3){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] t = {5,4,8,9,9,9,9,3};
        isConsecutiveFour(t);
    }
}
