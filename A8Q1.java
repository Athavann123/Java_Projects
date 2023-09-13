package Projects;
import java.util.*;
public class A8Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many dice would you like to roll:");
        int num = input.nextInt();
        rollDice(num);
    }

    public static void rollDice(int num){
        Random generator = new Random();
        int total = 0;
        for(int i = 1; i <= num; i++){
            int dice = generator.nextInt(1, 6);
            System.out.println("Dice " + i + " = " + dice);
            total += dice;
        }
        System.out.println("Sum = " + total);
    }
}
