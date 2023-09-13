package Projects;

import java.util.Scanner;

public class Lab2Task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter lower limit:");
        int lowerLimit = input.nextInt();
        System.out.println("Enter upper limit:");
        int upperLimit = input.nextInt();
        int es = 0;
        int os = 0;
        for(int i = lowerLimit; i <= upperLimit; i++){
            if(i % 2 == 0){
                es = es + i;
            }

            else{
                os = os + i;
            }
        }

        System.out.println((upperLimit - lowerLimit) + 1 + " numbers between " + lowerLimit + " and " + upperLimit
                + ": sum of odds (" + os + ")" + " and sum of evens (" + es + ")");
    }
}
