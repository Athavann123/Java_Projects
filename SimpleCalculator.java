package Projects;
import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = input.nextInt();
        System.out.println("Enter b value");
        int b = input.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
