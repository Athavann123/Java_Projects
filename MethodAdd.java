package Projects;

public class MethodAdd {
    public static void main(String[] args){
        int x = func_2();
        System.out.println(x);
        x = func_4(x);
        System.out.println(x);
    }

    public static int func_2(){
        int x = 2;
        return x;
    }

    public static void func_3(int x){
        int y = 1;
        x = x + 1;
        System.out.println(x);
    }

    public static int func_4(int x){
        int y = 3;
        x = x + y;
        System.out.println(x);
        return x;
    }
}
