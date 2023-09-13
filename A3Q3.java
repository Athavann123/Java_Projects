package Projects;
import java.util.*;
public class A3Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n1 = input.nextInt();
        System.out.println("Enter another number:");
        int n2 = input.nextInt();
        System.out.println("Enter the operation(+, -, *, /):");
        String o = input.next();

        if (o.equals("+")){
            System.out.println("The answer is " + (n1 + n2));
        }

        else if (o.equals("-")){
            System.out.println("The answer is " + (n1 - n2));
        }

        else if (o.equals("*")){
            System.out.println("The answer is " + (n1 * n2));
        }

        else if (o.equals("/")){
            System.out.println("The answer is " + (n1 / n2));
        }
    }
}
