package operationprogrames;

import java.util.Scanner;

public class MaxAndMin {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number ");
		int a=sc.nextInt();
		System.out.println("ente;r second number ");
		int b=sc.nextInt();
		System.out.println("enter third number ");
		int c=sc.nextInt();
		
		System.out.println(a+b*c);
		System.out.println( c+a/b);
		System.out.println( a%b+c);
		System.out.println( a*b+c);
		
		int max=a>b&&a>c?a:b>c?b:c;
		System.out.println("max element "+ max);
		
		int min=a<b&&a<c?a:b<c?b:c;
		System.out.println("min element is "+min);
	}

}
