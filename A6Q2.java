package Projects;
import java.util.*;
public class A6Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String o;
        do{
            System.out.println("Enter a number:");
            int n1 = input.nextInt();
            System.out.println("Enter another number:");
            int n2 = input.nextInt();
            System.out.println("Enter the operation(+, -, *, /, ^) press q to exit:");
            o = input.next();

            switch(o){
                case "+":
                    System.out.println(n1 + n2);
                    break;
                case "-":
                    System.out.println(n1 - n2);
                    break;
                case "*":
                    System.out.println(n1 * n2);
                    break;
                case "/":
                    System.out.println(n1 / n2);
                    break;
                case "^":
                    System.out.println(Math.pow(n1, n2));
                    break;
            }
        }
        while(!o.equalsIgnoreCase("q"));
    }
}
