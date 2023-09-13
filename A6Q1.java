package Projects;
import java.util.*;
public class A6Q1 {
    public static void main(String[] args){
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        int count = 0;
        int c;
        do{
            count += 1;
            System.out.println("Choose a number between 1-5 on how many dice to roll. Type 0 to quit.");
            c = input.nextInt();
            System.out.println("Roll #" + count);
            int dice1 = generator.nextInt(1, 6);
            int dice2 = generator.nextInt(1, 6);
            int dice3 = generator.nextInt(1, 6);
            int dice4 = generator.nextInt(1, 6);
            int dice5 = generator.nextInt(1, 6);
            switch(c){
                case 1:
                    System.out.println("Total: " + dice1);
                    break;
                case 2:
                    System.out.println("Total: " + (dice1 + dice2));
                    break;
                case 3:
                    System.out.println("Total: " + (dice1 + dice2 + dice3));
                    break;
                case 4:
                    System.out.println("Total: " + (dice1 + dice2 + dice3 + dice4));
                    break;
                case 5:
                    System.out.println("Total: " + (dice1 + dice2 + dice3 + dice4 + dice5));
                    break;
            }
        }
        while(c != 0);
    }
}
