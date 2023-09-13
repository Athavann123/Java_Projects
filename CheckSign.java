package Projects;
import java.util.*;
public class CheckSign {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = input.nextInt();

        if (num > 0){
            System.out.println("Your number is positive.");
        }

        else if (num < 0){
            System.out.println("Your number is negative");
        }
    }
}
