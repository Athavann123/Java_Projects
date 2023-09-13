package Projects;
import java.util.*;
public class A3Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a mark:");
        int mark = input.nextInt();

        if (mark >= 90 && mark <= 100){
            System.out.println("Mark is A+");
        }

        else if (mark >= 80 && mark <= 89){
            System.out.println("Mark is A");
        }

        if (mark >= 70 && mark <= 79){
            System.out.println("Mark is B");
        }

        if (mark >= 60 && mark <= 69){
            System.out.println("Mark is C");
        }

        if (mark >= 50 && mark <= 59){
            System.out.println("Mark is D");
        }

        if (mark < 50 && mark > 0){
            System.out.println("Mark is F");
        }

        if(mark < 0 || mark > 100){
            System.out.println("Mark is invalid");
        }

    }
}
