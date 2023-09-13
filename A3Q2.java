package Projects;
import java.util.*;
public class A3Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the temperature?");
        float t = input.nextFloat();
        System.out.println("What is the unit?");
        String u = input.next();

        if (u.equalsIgnoreCase("C")){
            System.out.println("Temperature is " + ((t * 1.8) + 32) + "°F");
        }

        else if (u.equalsIgnoreCase("F")){
            System.out.println("Temperature is " + ((t - 32) * 1.8) + "°C");
        }
    }
}
