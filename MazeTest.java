package Projects;

public class MazeTest {
    public static void main(String[] args){
        String [][] array = {{"1110", "1010", "1010", "1000", "1010", "1011", "1001"},
                {"1010","1000","1001","0101","1100","1001", "1001"},
                {"1100", "0011", "0101", "0110", "0011", "0101", "1001"},
                {"0101", "1101", "0110", "1001", "1110", "0000", "1001"},
                {"0110", "0011", "1110", "0010", "1010", "0011", "1001"}};
        int gate1 = leftGate(array, 0, 0, 0);
        int gate2 = rightGate(array, 0, array[0].length - 1, 0);
        int gate3 = topGate(array, 0, 0, 0);
        int gate4 = bottomGate(array, array.length - 1, 0, 0);
        System.out.println(gate1 + gate2 + gate3 + gate4 >= 2);
        //System.out.println();
        for(int i = 0; i < array[0].length; i++){
            System.out.println(array[0][i]);
        }
    }

    /**
     * @param array, the 2D array that contains the information about the maze
     * @param row, this parameter must be 0 and this parameter will increment
     * @param column, this parameter must be 0 and is a fixed value
     * @param counter, this parameter is set to 0 and will count how many gates from the left side are open
     * @return the return value will be the total number of open gates on the left side
     */
    public static int leftGate(String [][] array, int row, int column, int counter){
        if(row >= array.length){
            //if row parameter is greater than the number of columns - 1 then return 0
            return 0;
        }

        else{
            if(array[row][column].charAt(1) == '0'){
                //if the elements of the first column contain a 0 as the second character in the String, then add 1 to the counter
                counter = 1;
            }
            if(array[row][column].charAt(1) == '1'){
                //if the elements of the first column contain a 1 as the second character in the String, then add 0 to the counter
                counter = 0;
            }
            //It will keep doing this recursively until it reaches the final element of the first column
            return counter + leftGate(array, row + 1, column, counter);
        }
    }

    /**
     * @param array, the 2D array that contains the information about the maze
     * @param row, this parameter must be 0 and this parameter will increment
     * @param column, this parameter is the number of elements per row - 1 and is a fixed value
     * @param counter, this is a parameter set to 0 and will count how many gates from the right side are open
     * @return the return value will be the total number of open gates on the right side
     */
    public static int rightGate(String [][] array, int row, int column, int counter){
        if(row >= array.length){
            //if row parameter is greater than the number of elements per row then return 0
            return 0;
        }

        else{
            if(array[row][column].charAt(3) == '0'){
                //if the elements of the last column contain a 0 as the last character in the String, then add 1 to the counter
                counter = 1;
            }
            if(array[row][column].charAt(3) == '1'){
                //if the elements of the last column contain a 1 as the last character in the String, then add 0 to the counter
                counter = 0;
            }
            //It will keep doing this recursively until it reaches the final element of the last column
            return counter + rightGate(array, row + 1, column, counter);
        }
    }

    /**
     * @param array, the 2D array that contains the information about the maze
     * @param row, this parameter must be 0 and is a fixed value
     * @param column, this parameter must be 0 and will increment
     * @param counter, this is a parameter set to 0 and will count how many gates from the top side are open
     * @return the return value will be the total number of open gates on the top side
     */
    public static int topGate(String[][] array, int row, int column, int counter) {
        if(column >= array[0].length){
            //if column parameter is greater than the number of elements per row - 1 then return 0
            return 0;
        }

        else{
            if(array[row][column].charAt(0) == '0'){
                //if the elements of the first row contain a 0 as the first character in the String, then add 1 to the counter
                counter = 1;
            }
            if(array[row][column].charAt(0) == '1'){
                //if the elements of the first row contain a 1 as the first character in the String, then add 0 to the counter
                counter = 0;
            }
            //It will keep doing this recursively until it reaches the final element of the last column
            return counter + topGate(array, row, column + 1, counter);
        }
    }

    /**
     * @param array, the 2D array that contains the information about the maze
     * @param row, this parameter is the amount elements per column and is a fixed value
     * @param column, this parameter must be 0 and will increment
     * @param counter, this is a parameter set to 0 and will count how many gates from the top side are open
     * @return the return value will be the total number of open gates on the top side
     */
    public static int bottomGate(String[][] array, int row, int column, int counter){
        if(column >= array[array.length - 1].length){
            //if column parameter is greater than the number of elements of the bottom row then return 0
            return 0;
        }

        else{
            if(array[row][column].charAt(2) == '0'){
                //if the elements of the last row contain a 0 as the third character in the String, then add 1 to the counter
                counter = 1;
            }
            if(array[row][column].charAt(2) == '1'){
                //if the elements of the last row contain a 1 as the third character in the String, then add 0 to the counter
                counter = 0;
            }
            //It will keep doing this recursively until it reaches the final element of the last column
            return counter + bottomGate(array, row, column + 1, counter);
        }
    }



}
