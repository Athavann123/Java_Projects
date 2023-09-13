package Projects;
import java.util.*;
public class AreaPerimeterRec {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length");
        int l = input.nextInt();
        System.out.println("Enter width");
        int w = input.nextInt();
        int p = (l * 2) + (w * 2);
        if (l <= 0 || w <= 0) {
            System.out.println("Invalid");
            System.exit(0);
        }

        else{
            System.out.println("Area: " + l * w);
            System.out.println("Perimeter: " + p);
        }
    }
}
