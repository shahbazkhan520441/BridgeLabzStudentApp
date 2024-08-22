package regularexpresion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcherdemo {
public static void main(String[] args) {
//	Pattern pattern = Pattern.compile("abc");
//	Matcher matcher = pattern.matcher("abc");
//	boolean result = matcher.matches(); // true
//     System.out.println(result);
	
//	Pattern pattern = Pattern.compile("\\d+");
//	Matcher matcher = pattern.matcher("123abc456");
//	while (matcher.find()) {
//	    System.out.println(matcher.group()); // "123", "456"
//	}

	Pattern pattern = Pattern.compile("\\d+");
	Matcher matcher = pattern.matcher("abc123def456");
	boolean found = matcher.find(3); // starts searching at index 3
	System.out.println(found);
	
//	matcher.find();
//	int start = matcher.start(); // starting index of the found match
//System.out.println(start);
matcher.find();
String group = matcher.group(); // matched subsequence
System.out.println(group);

}
}
