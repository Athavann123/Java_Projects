package Projects;
import java.util.*;
public class A7Q5 {
    public static void main(String[] args){
        String[] val = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suit = {"Clubs", "Spades", "Hearts", "Diamonds"};
        String[] deck = new String[52];

        for(int i = 0; i < deck.length; i++){
            deck[i] = val[i % 13] + " of " + suit[i/13];
        }

        for(int i = 0; i < deck.length; i++){
            System.out.println(deck[i]);
        }
    }
}
