package Projects;
import java.util.*;
public class GreaterNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number:");
        int n1 = input.nextInt();
        System.out.println("Input another number:");
        int n2 = input.nextInt();
        System.out.println("Input another number:");
        int n3 = input.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("The greater number is " + n1);
        }

        else if(n2 > n1 && n2 > n3){
            System.out.println("The greater number is " + n2);
        }

        else{
            System.out.println("The greater number is " + n3);
        }
    }
}
