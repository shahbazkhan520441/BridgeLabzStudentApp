package programes_using_forloop;

public class SumOfNaturanNumbers {
	public static void main(String[] args) {
		int n=10,sum=0;

		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		
		System.out.println("sum of "+ n + " natural number is "+ sum);
	}
}
