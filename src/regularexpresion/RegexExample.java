package regularexpresion;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {
        String regex = "[A-Za-z]+\\d*";
        String input = "Code123 Java Regex456";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}
