package Projects;

public class Mathod1_2 {
    public static void main(String[] args){
        int x = 1;
        System.out.println(func_3(func_2(func_1(x), x), x, func_1(x)));
    }

    public static int func_1(int y){
        System.out.println(y);
        return y + 1;
    }

    public static int func_2(int x, int y){
        System.out.println(x);
        return x + y;
    }

    public static int func_3(int x, int y, int z){
        System.out.println(x);
        return x + y + z;
    }
}
