package Projects;
import java.util.*;
public class Averages3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] avg = new int[10];
        int total = 0;
        for(int i = 0; i < avg.length; i++){
            System.out.println("Enter a number:");
            avg[i] = input.nextInt();
            total += avg[i];
        }
        System.out.println("Sum: " + total);
        System.out.println("Average: " + (total/ avg.length));
    }
}
