package Projects;
import java.util.*;
public class EvenNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number:");
        int number = input.nextInt();
        int count = 1;
        System.out.println(count);
        while(count < number){
            count += 1;

            if(count % 2 == 0){
                System.out.println(count);
            }
        }
    }
}
