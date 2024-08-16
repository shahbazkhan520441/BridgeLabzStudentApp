package programes_using_forloop;

public class PalindromeNumber {
public static void main(String[] args) {
	int n=141,rev=0,temp;
    int x=n;
	while(n !=0) {
		temp=n%10;
		rev=rev * 10 + temp;
		n=n/10;
	}
	
	if(x==rev) {
		System.out.println(x+ " is palindrome number");
	}
}
}
