package Projects;
import java.util.*;
public class Words {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 0;
        String stored_word = "";
        for(int i = 1; i <= 10; i++){
            System.out.println("Enter a word:");
            String word = input.next();
            stored_word = stored_word + " " + word;
        }

        System.out.println(stored_word);
    }
}
