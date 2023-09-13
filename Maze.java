package Projects;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args){
        String [][] array = {{"1110", "1010", "1010", "1000"},
                {"1010", "1000", "1001", "0101"},
                {"1100", "0011", "0101", "0110"},
                {"0101", "1101", "0110", "1001"},
                {"0110", "0011", "1110", "0010"}};

        String arr = toString(array);
        System.out.println(arr);
    }

    /**
     * precondition: requires 2D array
     * @param array
     * @return array_to string
     */
    public static String toString(String[][] array){
        String array_to_string = "";
        for(int i = 0; i < array.length; i++){
            array_to_string = array_to_string + "\n" + Arrays.toString(array[i]);
        }
        return array_to_string.replaceAll("[,]", "");
    }

}
