package Projects;

public class RecursionEx1 {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        int answer = func1(nums, 0, 4);
        System.out.println(answer);
    }

    public static int func1(int[] nums, int s, int e) {
        if(s == e){
            return nums[1];
        }

        else{
            return func1(nums, s, (s+e)/2) + func1(nums, (s+e)/2+1, e);
        }
    }

}
