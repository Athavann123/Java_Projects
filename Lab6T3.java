package Projects;

import java.util.Arrays;

public class Lab6T3 {
    public static void main(String[] args){
        int[] numbers = {2, 4, 6, 5, 1, 3};
        int[] temp = new int[numbers.length];
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 3 == 0){
                count += 1;
                temp[count - 1] = numbers[i];
            }
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 3 == 1){
                count += 1;
                temp[count - 1] = numbers[i];
            }
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 3 == 2){
                count += 1;
                temp[count - 1] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
