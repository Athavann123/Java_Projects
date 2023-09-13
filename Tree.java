package Projects;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args){
        TreeSet<String> set = new TreeSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Orange");
        set.add("Black");
        set.add("White");
        Iterator<String> iterator = set.iterator();
        Object t1 = set.first();
        Object t2 = set.last();
        System.out.println();
        System.out.println(t1);
        System.out.println(t2);

        while(iterator.hasNext()){
            if(iterator.next().equals("Orange")){
                System.out.println("Orange is found");
                break;
            }
        }
    }
}
