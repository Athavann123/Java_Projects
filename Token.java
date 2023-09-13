package Projects;

public class Token {
    public static void main(String[] args){
        String rose = "R ose";
        String token = Tokenizer(rose);
        System.out.println(rose.charAt(1) == ' ');
    }

    public static String Tokenizer(String word){
        if(word.length() == 0 || word.length() == 1){
            return word;
        }
        else{
            return word.charAt(0) + "\n" + Tokenizer(word.substring(1));
        }
    }
}
