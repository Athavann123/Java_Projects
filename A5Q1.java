package Projects;
import java.util.*;
public class A5Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = input.nextInt();
        System.out.println("Enter b value:");
        int b = input.nextInt();
        double cs = Math.pow(a, 2) + Math.pow(b, 2);
        System.out.println("The hypotenuse is " + Math.sqrt(cs));
    }
}
