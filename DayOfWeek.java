package Projects;
import java.util.*;
public class DayOfWeek {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What day is it today?");
        String w = input.next();

        if (w.equals("Sunday")){
            System.out.println("That is the first day of the week.");
        }

        else if (w.equals("Monday")){
            System.out.println("That is the second day of the week.");
        }

        else if (w.equals("Tuesday")){
            System.out.println("That is the third day of the week.");
        }

        else if (w.equals("Wednesday")){
            System.out.println("That is the fourth day of the week.");
        }

        else if (w.equals("Thursday")){
            System.out.println("That is the fifth day of the week.");
        }

        else if (w.equals("Friday")){
            System.out.println("That is the sixth day of the week.");
        }

        else if (w.equals("Saturday")){
            System.out.println("That is the seventh day of the week.");
        }

        else{
            System.out.println("Invalid");
        }
    }
}
