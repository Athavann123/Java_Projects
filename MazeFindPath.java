package Projects;

import java.util.ArrayList;

public class MazeFindPath {
    public static void main(String[] args){
        String[][] array = {{"1110", "1010", "1010", "1000"},
                {"1010", "1000", "1001", "0101"},
                {"1100", "0011", "0101", "0110"},
                {"0101", "1101", "0110", "1001"},
                {"0110", "0011", "1110", "0010"}};

        String path = findPath(array, 1, 0);
        System.out.println(path);
    }

    public static String findPath(String[][] maze, int row, int column){
        String path = "(" + row + "," + column + ")";
        path += "(" + row + "," + column + ")";
        adjacentElements(maze, row, column);
        return path;
    }

    public static void adjacentElements(String[][] maze, int row, int column){
        if(row < 0){
            elements(maze, row + 1, column);
            elements(maze, row, column - 1);
            elements(maze, row, column + 1);
        }
        if(row > maze[0].length){
            elements(maze, row - 1, column);
            elements(maze, row, column - 1);
            elements(maze, row, column + 1);
        }
        if(column < 0){
            elements(maze, row, column + 1);
            elements(maze, row - 1, column);
            elements(maze, row + 1, column);
        }
        if(column > maze.length){
            elements(maze, row, column - 1);
            elements(maze, row - 1, column);
            elements(maze, row + 1, column);
        }

    }

    public static void elements(String[][] maze, int row, int column) {
        ArrayList<String> list = new ArrayList<>();
        if(row < 0 || column < 0 || row > maze[0].length - 1 || column > maze.length - 1){
            list.add("");
        }
        else{
            list.add(maze[row][column]);
        }
        checkOpening(list, maze, row, column);
    }

    public static void checkOpening(ArrayList<String> list, String[][] maze, int row, int column) {
        if(maze[row][column].charAt(0) == '0' && list.get(0).charAt(2) == '0'){
            findPath(maze, row - 1, column);
        }
        if(maze[row][column].charAt(2) == '0' && list.get(1).charAt(0) == '0'){
            findPath(maze, row + 1, column);
        }
        if(maze[row][column].charAt(1) == '0' && list.get(2).charAt(3) == '0'){
            findPath(maze, row, column - 1);
        }
        if(maze[row][column].charAt(3) == '0' && list.get(3).charAt(1) == '0'){
            findPath(maze, row, column + 1);
        }

    }



}
