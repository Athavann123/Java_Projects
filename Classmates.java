package Projects;
import java.util.*;
public class Classmates {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] names = new String[10];

        for(int i = 0; i < names.length; i++){
            System.out.println("Enter a name:");
            names[i] = input.next();
        }

        System.out.println("Enter a name to search:");
        String search = input.next();

        for(int i = 0; i < names.length; i++){
            if(names[i].equals(search)){
                System.out.println(search + " is a good friend");
            }
        }
    }
}
