package Projects;
import java.util.*;
public class Multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        if(n <= 0){
            System.out.println("Invalid");
            System.exit(0);
        }

        else {
            for (int i = 0; i <= 12; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}
