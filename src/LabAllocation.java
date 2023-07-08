
import java.util.Scanner;
public class LabAllocation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();
        int remainingSpace1 = (x - n);
        int remainingSpace2 = (y - n);
        int remainingSpace3 = (z - n);
        int min=Integer.MAX_VALUE;

        if (remainingSpace1 > 0 && min>remainingSpace1) {
                min= remainingSpace1;
        } if (remainingSpace2 > 0 && min>remainingSpace2) {
            min=remainingSpace2;
        } if(remainingSpace3> 0 && min>remainingSpace3) {
            min=remainingSpace3;
        } if(min==remainingSpace1){
            System.out.println("L1");
        }
        else if(min== remainingSpace2){
            System.out.println("L2");
        }
        else if(min== remainingSpace3){
            System.out.println("L3");
        }

    }
}
