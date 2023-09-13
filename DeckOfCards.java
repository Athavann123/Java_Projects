package Projects;
import java.util.*;
public class DeckOfCards {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String[] val = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suit = {"Clubs", "Spades", "Hearts", "Diamonds"};
        String[] deck = new String[52];

        for(int i = 0; i < deck.length; i++){
            deck[i] = val[i % 13] + " of " + suit[i/13];
        }

        for(int i = 0; i < deck.length; i++){
            list.add(deck[i]);
        }

        while(true){
            System.out.println("Press enter to shuffle card type exit to quit:");
            String q = input.nextLine();

            if(q.equalsIgnoreCase("exit")){
                break;
            }

            else{
                Collections.shuffle(list);

                for(int i = 0; i < list.size(); i++){
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
