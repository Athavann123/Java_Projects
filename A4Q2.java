package Projects;
import java.util.*;
public class A4Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 0;
        while(true){
            System.out.println("Enter your 4-digit pin number:");
            int p = input.nextInt();

            if(p == 2019){
                System.out.println("Access Granted");
                break;
            }

            else{
                System.out.println("Incorrect pin. Access denied.");
                count += 1;
            }
        }

        System.out.println("Number of incorrect attempts = " + count);
    }
}
