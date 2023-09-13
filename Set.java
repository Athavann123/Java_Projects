package Projects;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");

        Iterator<String> iterator = set.iterator();
        Object[] colors = set.toArray();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        if(set.size() != 0){
            System.out.println("Set is not empty");
        }
        else{
            System.out.println("Set is empty");
        }

        HashSet<String> color = new HashSet<>(set);
        System.out.println(color);
    }
}
