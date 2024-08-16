package programes_using_forloop;

public class ReverseIntegerNumber {
	public static void main(String[] args) {
		int n=141,rev=0;


		String ns = Integer.toString(n);

		for(int i=ns.length()-1;i>=0;i--) {
			int digit = ns.charAt(i) - '0';
		     rev=rev* 10+ digit;
		}

		System.out.println("Reversed Number: " + rev);

	}
}
