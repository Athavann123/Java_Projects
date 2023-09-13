package Projects;
import java.util.*;
public class LargestValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] n = new int[10];
        int num = 0;

        for(int i = 0; i < n.length; i++){
            System.out.println("Enter a number:");
            n[i] = input.nextInt();

            if(num < n[i]){
                num = n[i];
            }
        }
        System.out.println("Largest Number: " + num);
    }
}
