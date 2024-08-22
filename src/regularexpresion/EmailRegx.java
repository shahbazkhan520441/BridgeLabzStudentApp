package regularexpresion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegx {

	public static void main(String[] args) {
		
		String regex = "^[a-zA-Z0-9$_-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$";
		String input = "shahbazkhan520441@gmail.com";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		if (matcher.matches()) {
			System.out.println("Valid  email"+"  :"+input);
		} else {
			System.out.println("Invalid  email"+"  :"+input);
		}

	}
}


	
