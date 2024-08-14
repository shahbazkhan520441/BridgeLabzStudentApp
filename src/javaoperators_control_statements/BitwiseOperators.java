package javaoperators_control_statements;

public class BitwiseOperators {
	/*
	 * Java defines several bitwise operators, which can be applied to the integer
	 * types, long, int, short, char, and byte. Bitwise operator works on bits and
	 * performs bit‐by‐bit operation. Assume if a = 60; and b = 13; now in binary
	 * format they will be a = 0011 1100 and b = 0000 1101.
	 */

	public static void main(String[] args) {

		int a = 60; /* 60 = 0011 1100 */
		int b = 13; /* 13 = 0000 1101 */
		int c = 0;
		
		c = a & b; /* 12 = 0000 1100 */
		System.out.println("a & b = " + c );
		
		c = a | b; /* 61 = 0011 1101 */
		System.out.println("a | b = " + c );
		
		c = a ^ b; /* 49 = 0011 0001 */
		System.out.println("a ^ b = " + c );
		
		c = ~a; /*-61 = 1100 0011 */
		System.out.println("~a = " + c );
		
		c = a << 2; /* 240 = 1111 0000 */
		System.out.println("a << 2 = " + c );
		
		c = a >> 2; /* 215 = 1111 */
		System.out.println("a >> 2 = " + c );
		
		c = a >>> 2; /* 215 = 0000 1111 */
		System.out.println("a >>> 2 = " + c );
		
	}

}
