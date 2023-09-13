package Projects;
import java.util.*;
import java.util.ArrayList;
public class Alist2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 5; i++){
            System.out.println("Enter a word:");
            list.add(input.next());
        }

        System.out.println("Enter maximum word length:");
        int num = input.nextInt();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() > num){
                list.remove(i);
            }
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() > num){
                list.remove(i);
            }
        }

        System.out.println(list);
    }
}
