package Projects;
import java.util.*;
import java.util.ArrayList;
public class AList1 {
    public static void main(String[] args){
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 50; i++){
            list.add(generator.nextInt(1, 100));
        }

        System.out.println("Enter a number between 1 and 10:");
        int num = input.nextInt();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % num == 0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
