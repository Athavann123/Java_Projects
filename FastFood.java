package Projects;
import java.util.*;
public class FastFood {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int c;
        double total = 0;
        double cost = 0;
        do{
            System.out.println("Which food would you like to order");
            System.out.println("1: Fries $1.50");
            System.out.println("2: Soda $1.00");
            System.out.println("3: Hamburger $3.50");
            System.out.println("4: Wrap $2.00");
            System.out.println("5: Tacos $2.50");
            System.out.println("6: Fried Chicken $4.00");
            c = input.nextInt();
            switch(c){
                case 1:
                    cost = 1.50;
                    break;
                case 2:
                    cost = 1.00;
                    break;
                case 3:
                    cost = 3.50;
                    break;
                case 4:
                    cost = 2.00;
                    break;
                case 5:
                    cost = 2.50;
                    break;
                case 6:
                    cost = 4.00;
                    break;
            }
            total += cost;
        }
        while(c != 0);
        System.out.println("Final Total: $" + total);
    }
}
