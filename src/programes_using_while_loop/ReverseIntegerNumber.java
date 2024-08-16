package programes_using_while_loop;

public class ReverseIntegerNumber {

	public static void main(String[] args) {
		int n=141,rev=0,temp;

		while(n !=0) {
			temp=n%10;
			rev=rev * 10 + temp;
			n=n/10;
		}
		
		 System.out.println("Reversed Number: " + rev);

	}
}