package Projects;

import java.util.Arrays;

public class Lab6T1 {
    public static void main(String[] args){
        int[] number = {1, 2, 3, 4, 5, 6};
        int count = 0;
        int[] temp = new int[number.length];
        for(int i = 0; i < number.length; i++){
            if(number[i] % 3 == 0){
                count += 1;
                temp[count-1] = number[i];
            }
        }
        int[] multiple = new int[count];
        for(int i = 0; i < multiple.length; i++){
            multiple[i] = temp[i];
        }
        System.out.println(Arrays.toString(multiple));
    }
}
