package Projects;

public class grade {
    public static void main(String[] args){
        String message = printMessage(0);
        System.out.println(message);
    }

    public static String printMessage(double grade){
        if(grade < 0 || grade > 100){
            throw new IllegalArgumentException();
        }

        if(grade >= 80){
            return "Excellent";
        }

        if(grade >= 50){
            return "Good";
        }

        else{
            return "Fail";
        }
    }
}
