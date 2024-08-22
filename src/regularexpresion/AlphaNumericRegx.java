package regularexpresion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphaNumericRegx {
//	[a-z] except only one character from a-z
//	[A-Z]  except only one character from A-Z
//	[a-zA-Z]  except only one character from a-zA-Z
//	[a-zA-Z]+  except atlest one character or more from a-zA-Z
//	[a-zA-Z]*  except zero 0r more  character from a-zA-Z
//	[a-zA-Z0-9]+ alpha numeric regex
//	[a-zA-Z0-9@#]+ alpha numeri with special sysmbolc regex
//	[0-9]{10} for 10 digits number
//	^[a-zA-Z0-9_#$.-]+@[a-zA-Z]+\.[a-zA-Z]{2,}$	
	
	
	public static void  checkStringAginstRE(String re,String str) {
		Pattern pattern = Pattern.compile(re);
		Matcher matcher = pattern.matcher(str);
		boolean matches = matcher.matches();
		System.out.println(matches);
		
	}
	
	public static void main(String[] args) {
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter regular expression");
		String re =sc.nextLine();
		System.out.println("enter your string");
		String str=sc.nextLine();
		System.out.println("did you want to exit (Y/N)");
		
	    checkStringAginstRE(re, str);
	    
		String choice = sc.nextLine();
		if(choice.equalsIgnoreCase("Y")) {
			System.out.println(" thank you for using app ");
			break;
		}
		}
		
	}

}
