package Projects;
import java.util.*;
public class A7Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int[] num = new int[50];

        for(int i = 0; i < num.length; i++){
            num[i] = generator.nextInt(1, 100);
        }

        System.out.println("Enter a number:");
        int n = input.nextInt();

        for(int i = 0; i < num.length; i++){
            if(num[i] % n == 0){
                System.out.println(num[i]);
            }
        }
    }
}
