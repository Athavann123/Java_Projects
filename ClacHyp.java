package Projects;
import java.util.*;
public class ClacHyp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'a' value:");
        double a = input.nextDouble();
        System.out.println("Enter 'b' value:");
        double b = input.nextDouble();
        double c = hyp(a, b);
        System.out.println("The hypotenuse is " + c);
    }

    public static double hyp(double a, double b){
        return Math.hypot(a, b);
    }
}
