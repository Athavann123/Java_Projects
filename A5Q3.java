package Projects;
import java.util.*;
public class A5Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int count = 0;
        while(true){
            count += 1;
            int a = generator.nextInt(1, 10);
            System.out.println("Round " + count);
            System.out.println("Guess a number from 1 to 10. Enter -1 to exit.");
            System.out.println("Your guess:");
            int n = input.nextInt();

            if(n == -1){
                break;
            }

            else if(n == a){
                System.out.println("Correct! My number is " + a + "!");
            }

            else{
                System.out.println("Sorry the number I have is " + a + "!");
            }
        }
    }
}
