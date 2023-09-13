package Projects;
import java.util.*;
public class Average {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers are being added:");
        int n = input.nextInt();
        int total = 0;
        if(n <= 0){
            System.out.println("Invalid");
            System.exit(0);
        }

        else{
            for(int i = 1; i <= n; i++){
                System.out.println("Enter a mark:");
                int mark = input.nextInt();
                total = total + mark;
            }
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + (total/n));
    }
}
