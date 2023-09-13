package Projects;
import java.util.ArrayList;
import java.util.Collections;

public class list {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        list.set(2, "Yellow");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
