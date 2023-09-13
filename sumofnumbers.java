package Projects;

public class sumofnumbers {
    public static void main(String[] args){
        int sum = getSum(0, 5);
        System.out.println(sum);
    }

    public static int getSum(int start, int end){
        if(end == start){
            return 0;
        }

        else{
            return end + getSum(start, end - 1);
        }
    }
}
