package Projects;
import java.util.*;
public class A2Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st subject");
        String s1 = input.next();
        System.out.println("Enter 2nd subject");
        String s2 = input.next();
        System.out.println("Enter 3rd subject");
        String s3 = input.next();
        System.out.println("Enter 4th subject");
        String s4 = input.next();
        System.out.println("Enter the mark for " + s1);
        int m1 = input.nextInt();
        System.out.println("Enter the mark for " + s2);
        int m2 = input.nextInt();
        System.out.println("Enter the mark for " + s3);
        int m3 = input.nextInt();
        System.out.println("Enter the mark for " + s4);
        int m4 = input.nextInt();
        System.out.println("Subject:          Grade:");
        System.out.println(s1 + "          " + m1);
        System.out.println(s2 + "          " + m2);
        System.out.println(s3 + "          " + m3);
        System.out.println(s4 + "          " + m4);
    }
}
