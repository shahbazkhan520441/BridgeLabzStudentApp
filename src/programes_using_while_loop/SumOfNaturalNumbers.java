package programes_using_while_loop;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int n=10,sum=0;


		while(n!=0) {

			sum=sum+n;
			n--;
		}

		System.out.println("sum of "+ n + " natural number is "+ sum);
	}

}
