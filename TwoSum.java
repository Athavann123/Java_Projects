package Projects;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {3, 3};
        int firstnumber = 0;
        int secondnumber = 0;
        int sum;
        int target = 6;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                sum = nums[i] + nums[j];

                if(i == j){
                    sum = 0;
                }

                if(sum == target){
                    firstnumber = i;
                    secondnumber = j;
                }
            }
        }
        System.out.printf("[%d, %d]", secondnumber, firstnumber);
    }
}
