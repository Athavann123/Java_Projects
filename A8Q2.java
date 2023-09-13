package Projects;
import java.util.*;
public class A8Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What character:");
        String c = input.next();
        System.out.println("Enter width:");
        int w = input.nextInt();
        System.out.println("Enter height:");
        int h = input.nextInt();
        printRect(c, w, h);
    }

    public static void printRect(String c, int w, int h){
        for(int i = 1; i <= w; i++){
            for(int j = 1; j <= h; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
