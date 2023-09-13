package Projects;

import java.util.Arrays;

public class Lab6T4 {
    public static void main(String[] args){
        int[][] numbers = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}, {10, 11}};
        int count = 0;
        int l = 0;
        for(int i = 0; i < numbers.length; i++){
            count += numbers[i].length;
        }
        int[] temp = new int[count];

        for(int i = 0; i < numbers.length; i++){
            if(i % 2 == 0){
                for(int j = 0; j < numbers[i].length; j++){
                    l += 1;
                    temp[l - 1] = numbers[i][j];
                }
            }
            else{
                for(int k = numbers[i].length - 1; k >= 0; k--){
                    l += 1;
                    temp[l - 1] = numbers[i][k];
                }
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
