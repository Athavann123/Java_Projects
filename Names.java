package Projects;
import java.util.*;
public class Names {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        String s = "";
        for(int i = 0; i < names.length; i++){
            System.out.println("Enter a name:");
            names[i] = input.next();
            s = s + " " + names[i];
        }
        System.out.println(s);
    }
}
