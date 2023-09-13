package Projects;
import java.util.*;
public class Lab2Task3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numerator:");
        int numerator = input.nextInt();
        System.out.println("Enter denominator:");
        int denominator = input.nextInt();
        System.out.println("Enter exponent:");
        int exponent = input.nextInt();
        int n1 = (int) Math.pow(numerator, exponent);
        int n2 = (int) Math.pow(denominator, exponent);
        double answer = (double) n1/n2;
        System.out.println((double)Math.round(answer * 1000000d) / 1000000d);
    }
}
