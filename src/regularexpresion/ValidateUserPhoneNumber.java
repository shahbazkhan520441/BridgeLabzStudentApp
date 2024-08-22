package regularexpresion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserPhoneNumber {
    public static void main(String[] args) {
        
        String regex = "^(\\+91[\\-\\s]?)?[0]?(91)?[6789]\\d{9}$";
        String input = "6362520441";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        if (matcher.matches()) {
            System.out.println("Valid phone number"+"  :"+input);
        } else {
            System.out.println("Invalid phone number"+"  :"+input);
        }
    }
}
