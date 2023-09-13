package Projects;
import java.util.*;
public class PhoneBook {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] names = new String[3];
        int[] num = new int[3];

        for(int i = 0; i < names.length; i++){
            System.out.println("Enter a name:");
            names[i] = input.next();
        }

        for(int i = 0; i < num.length; i++){
            System.out.println("Enter a phone number:");
            num[i] = input.nextInt();
        }

        System.out.println("Enter a name to search:");
        String search = input.next();

        for(int i = 0; i < names.length; i++){

            if(names[i].equals(search)){
                System.out.println("Phone Number: " + num[i]);
                break;
            }

            else{
                System.out.println("Not found.");
            }
        }
    }
}
