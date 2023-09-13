package Projects;

import java.util.*;
import java.io.*;

public class ReadFile {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        String fileName = "C:\\Users\\Athavann\\Documents\\EECS 2030\\Lab_7\\EECS2030_Lab7\\input.txt";
        BufferedReader bufferedReader;
        try{
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = bufferedReader.readLine();

            while((line != null)){
                list.add(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        }

        catch(IOException e){
            e.printStackTrace();
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).substring(0, 5).equals("Stack")){
                list.remove(i);
            }
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).substring(0, 5).equals("Stack")){
                list.remove(i);
            }
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).substring(0, 5).equals("Stack")){
                list.remove(i);
            }
        }

        for(int i = 0; i < list.size(); i++){
            list1.add(list.get(i).replaceAll("\\s", "").replaceAll("Queue", ""));
        }

        list = list1;

        System.out.println(list.size());
    }
}
