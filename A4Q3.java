package Projects;
import java.util.*;
public class A4Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter a positive number:");
            int n = input.nextInt();

            if(n == 0){
                break;
            }

            else if(n % 2 == 0){
                System.out.println("Even");
            }

            else{
                System.out.println("Odd");
            }
        }
    }
}
