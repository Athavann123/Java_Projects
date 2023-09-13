package Projects;
import java.util.*;
public class A4Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        System.out.println("Number " + " Square" + " Cubed");
        for(int i = 1; i <= n; i++){
            System.out.println(i + "   " + "    " + (i*i) + "   " + "   " + (i*i*i));
        }
    }
}
