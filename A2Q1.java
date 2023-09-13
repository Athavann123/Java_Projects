package Projects;
import java.util.*;
public class A2Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1 = input.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = input.nextInt();
        System.out.println("Enter 3rd number");
        int n3 = input.nextInt();
        System.out.println("Enter 4th number");
        int n4 = input.nextInt();
        System.out.println("The answer is " + (n1 + n2) * (n3 - n4));
    }
}
