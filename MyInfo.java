package Projects;
import java.util.*;
public class MyInfo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Name:");
        String name = input.nextLine();
        System.out.println("DOB:");
        String date = input.nextLine();
        System.out.println("Address:");
        String add = input.nextLine();
        System.out.println("Email:");
        String email = input.nextLine();
        System.out.println("Phone Number:");
        String number = input.nextLine();
        System.out.println(name);
        System.out.println(date);
        System.out.println(add);
        System.out.println(email);
        System.out.println(number);
    }
}
