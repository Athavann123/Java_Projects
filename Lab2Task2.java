package Projects;
import java.util.*;
public class Lab2Task2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input seconds:");
        int seconds = input.nextInt();
        int min = seconds/60;
        int sec = seconds % 60;
        System.out.println(seconds + " seconds is (" + min + ") minutes and (" + sec + ") seconds");
    }
}
