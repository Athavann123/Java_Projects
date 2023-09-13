package Projects;
import java.util.*;
public class Lab2Task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance:");
        double balance = input.nextDouble();
        System.out.println("Enter interest:");
        double interest = input.nextDouble();
        double rate = interest/100;
        double p1 = 1 + rate;
        double p2 = Math.pow(p1, 5);
        double p3 = balance * p2;
        System.out.println((double)Math.round(p3 * 100d) / 100d);
    }
}
