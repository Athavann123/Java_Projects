package a1;

class LargeInt implements LargeIntInterface{
    public SpecializedList s1;

    public LargeInt(String number){
        s1 = new SpecializedList();
        int count = 0;
        if(number.charAt(0) == '-'){
            for(int i = 1; i < number.length(); i++){
                byte n = (byte) (number.charAt(i) - '0');
                s1.insertEnd(n);
            }
            s1.head.data = (byte) (s1.head.data * (-1));
        }

        else{
            while(count < number.length()){
                byte n = (byte) (number.charAt(count) - '0');
                s1.insertEnd(n);
                count++;
            }
        }
    }

    @Override
    public LargeInt add(LargeInt largeInt){
        String number_1String = toString();
        String number_2String = largeInt.toString();
        String str = "";
        if((number_1String.charAt(0) != '-') && (number_2String.charAt(0) != '-')){
            if(number_1String.length() > number_2String.length()){
                str = addnumbers(number_1String, number_2String);
            }
            if(number_2String.length() > number_1String.length()){
                str = addnumbers(number_2String, number_1String);
            }
            if(number_1String.length() == number_2String.length()){
                str = addnumbers(number_1String, number_2String);
            }
        }

        if((number_1String.charAt(0) == '-') && (number_2String.charAt(0) == '-')){
            number_1String = number_1String.replace("-", "");
            number_2String = number_2String.replace("-", "");
            if(number_1String.length() > number_2String.length()){
                str = addnumbers(number_1String, number_2String);
            }
            if(number_2String.length() > number_1String.length()){
                str = addnumbers(number_2String, number_1String);
            }
            if(number_1String.length() == number_2String.length()){
                str = addnumbers(number_1String, number_2String);
            }
            str = "-" + str;
        }

        if((number_1String.charAt(0) == '-') && (number_2String.charAt(0) != '-')){
            number_1String = number_1String.replace("-", "");
            if(number_1String.length() > number_2String.length()){
                str = subnumbers(number_1String, number_2String);
                str = "-" + str;
            }
            if(number_1String.length() < number_2String.length()){
                str = subnumbers(number_2String, number_1String);
            }
            if(number_1String.length() == number_2String.length()){
                if(number_1String.compareTo(number_2String) > 0){
                    str = subnumbers(number_1String, number_2String);
                    str = "-" + str;
                }
                if(number_1String.compareTo(number_2String) < 0){
                    str = subnumbers(number_2String, number_1String);
                }
            }
            if(number_1String.compareTo(number_2String) == 0){
                str = "0";
            }
        }
        if((number_1String.charAt(0) != '-') && (number_2String.charAt(0) == '-')){
            number_2String = number_2String.replace("-", "");
            if(number_1String.length() > number_2String.length()){
                str = subnumbers(number_1String, number_2String);
            }
            if(number_1String.length() < number_2String.length()){
                str = subnumbers(number_2String, number_1String);
                str = "-" + str;
            }
            if(number_1String.length() == number_2String.length()){
                if(number_1String.compareTo(number_2String) > 0){
                    str = subnumbers(number_1String, number_2String);
                }
                if(number_1String.compareTo(number_2String) < 0){
                    str = subnumbers(number_2String, number_1String);
                    str = "-" + str;
                }
            }
            if(number_1String.compareTo(number_2String) == 0){
                str = "0";
            }
        }
        return new LargeInt(str);
    }

    @Override
    public LargeInt subtract(LargeInt largeInt) {
        String number_1String = toString();
        String number_2String = largeInt.toString();
        String str = "";
        if((number_1String.charAt(0) != '-') && (number_2String.charAt(0) != '-')){
            if(number_1String.length() > number_2String.length()){
                str = subnumbers(number_1String, number_2String);
            }
            if(number_1String.length() < number_2String.length()){
                str = subnumbers(number_2String, number_1String);
                str = "-" + str;
            }
            if(number_1String.length() == number_2String.length()){
                if(number_1String.compareTo(number_2String) > 0){
                    str = subnumbers(number_1String, number_2String);
                }
                if(number_2String.compareTo(number_1String) > 0){
                    str = subnumbers(number_2String, number_1String);
                    str = "-" + str;
                }
                if(number_1String.compareTo(number_2String) == 0){
                    str = "0";
                }
            }
        }

        if((number_1String.charAt(0) == '-') && (number_2String.charAt(0) == '-')){
            number_1String = number_1String.replace("-", "");
            number_2String = number_2String.replace("-", "");
            if(number_1String.length() > number_2String.length()){
                str = subnumbers(number_1String, number_2String);
                str = "-" + str;
            }
            if(number_1String.length() < number_2String.length()){
                str = subnumbers(number_2String, number_1String);
            }
            if(number_1String.length() == number_2String.length()){
                if(number_1String.compareTo(number_2String) > 0){
                    str = subnumbers(number_1String, number_2String);
                    str = "-" + str;
                }
                if(number_2String.compareTo(number_1String) > 0){
                    str = subnumbers(number_2String, number_1String);
                }
            }
            if(number_1String.compareTo(number_2String) == 0){
                str = "0";
            }
        }
        if((number_1String.charAt(0) == '-') && (number_2String.charAt(0) != '-')){
            number_1String = number_1String.replace("-", "");
            if(number_1String.length() > number_2String.length()){
                str = addnumbers(number_1String, number_2String);
                str = "-" + str;
            }
            if(number_1String.length() < number_2String.length()){
                str = addnumbers(number_2String, number_1String);
                str = "-" + str;
            }
            if(number_1String.length() == number_2String.length()){
                str = addnumbers(number_1String, number_2String);
                str = "-" + str;
            }
        }
        if((number_1String.charAt(0) != '-') && (number_2String.charAt(0) == '-')){
            number_2String = number_2String.replace("-", "");
            if(number_1String.length() > number_2String.length()){
                str = addnumbers(number_1String, number_2String);
            }
            if(number_1String.length() < number_2String.length()){
                str = addnumbers(number_2String, number_1String);
            }
            if(number_1String.length() == number_2String.length()){
                str = addnumbers(number_1String, number_2String);
            }
        }
        return new LargeInt(str);
    }

    @Override
    public void setNegative(){
        s1.head.data = (byte) (s1.head.data * (-1));
    }

    public String addnumbers(String number1, String number2){
        String str = "";
        int count = number2.length() - 1;
        int count2 = number1.length() - 1;
        int sum;
        int remainder = 0;
        int firstnumber;
        int secondnumber;
        for(int i = count; i >= 0; i--){
            firstnumber = number1.charAt(count2) - '0';
            secondnumber = number2.charAt(i) - '0';
            sum = firstnumber + secondnumber + remainder;

            if(sum >= 10){
                sum -= 10;
                str = sum + str;
                remainder = 1;
            }

            else{
                str = sum + str;
                remainder = 0;
            }
            count2--;
        }
        int remaining_char = (number1.length() - number2.length()) - 1;
        int sum2 = 0;

        if(remaining_char == 0){
            str = ((number1.charAt(0) - '0') + remainder) + str;
        }

        else{
            while(remaining_char >= 0){
                sum2 = (number1.charAt(remaining_char) - '0') + remainder;
                if(sum2 >= 10){
                    sum2 -= 10;
                    str = sum2 + str;
                    remainder = 1;
                }

                else{
                    str = sum2 + str;
                    remainder = 0;
                }
                remaining_char--;
            }
        }
        if(remainder == 1 && (number1.length() == number2.length())){
            str = 1 + str;
        }
        return str;
    }

    public String subnumbers(String number1, String number2){
        StringBuilder stringBuilder = new StringBuilder();
        String number3 = "";
        for(int i = 0; i < (number1.length() - number2.length()); i++){
            number3 += "0";
        }
        number2 = number3 + number2;
        int difference = 0;
        int remainder = 0;
        int number1_char = 0;
        int number2_char = 0;

        for(int i = number1.length() - 1; i >= 0; i--){
            number1_char = number1.charAt(i) - '0';
            number2_char = number2.charAt(i) - '0';
            difference = number1_char - remainder - number2_char;
            if(difference < 0){
                difference += 10;
                remainder = 1;
            }
            else{
                remainder = 0;
            }
            stringBuilder.insert(0, difference);
        }
        int count = 0;

        while(count < stringBuilder.capacity()){
            if(stringBuilder.charAt(0) >= '1' && stringBuilder.charAt(0) <= '9'){
                break;
            }
            else{
                stringBuilder.deleteCharAt(0);
            }
            count++;
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        String num = "";
        int count = 0;
        byte digit;
        while(count < s1.lengthIs()){
            digit = s1.getNextItem();
            num = num + digit + "";
            count++;
        }
        s1.resetForward();
        return num;
    }
}
