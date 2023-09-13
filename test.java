package Projects;

public class test {
    public static void main(String[] args){
        String str = "* *";
        String remove = removeSpace(str);
        System.out.println(remove);
    }

    public static String removeSpace(String str){
        if(str.length() == 0){
            return str;
        }

        if(str.charAt(0) == ' '){
            return str.replaceAll(String.valueOf(str.charAt(0)), "");
        }

        else{
            return str.charAt(0) + removeSpace(str.substring(1));
        }
    }
}
