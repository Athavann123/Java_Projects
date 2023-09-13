package Projects;


import java.util.Arrays;

public class Lab6T2 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4};
        String[] pre = new String[numbers.length];
        String[] temp = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            String s = "[";
            for(int j = 0; j <= i; j++){
                if(j != i){
                    s += (numbers[j] + ", ");
                }
                else{
                    s += numbers[j];
                }
            }
            if(i < numbers.length - 1){
                s += "]";
            }
            else{
                s+=("]");
            }
            pre[i] = s;
        }

        for(int i = 0; i < pre.length; i++){
            temp[i] = "\"" + pre[i] + "\"";
        }

        System.out.println(Arrays.toString(temp));
    }
}
