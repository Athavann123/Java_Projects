package Projects;

import java.util.ArrayList;

public class Alist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list2.add(4);
        list2.add(5);
        list = list2;
        System.out.println(list);
    }
}
