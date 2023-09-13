package Projects;
import java.util.*;
public class FindMin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = input.nextInt();
        System.out.println("Enter another number:");
        int b = input.nextInt();
        System.out.println("Enter another number:");
        int c = input.nextInt();

        int min = Min(a , b, c);
        System.out.println("The minimum number is " + min);
    }

    public static int Min(int a, int b, int c){
        int min = 0;

        if(a < b && a < c){
            min = a;
        }

        else if(b < a && b < c){
            min = b;
        }

        else{
            min = c;
        }

        return min;
    }
}
