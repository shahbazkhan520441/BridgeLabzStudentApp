package loopingstatements;

public class LoopingStatements {

	public static void main(String[] args) {
		int x = 11;

		while( x < 20 ) {
			System.out.print("value of x : " + x );
			x++;
			System.out.print("\n");
		}
		System.out.println("--------------------");
		
//		---------------------------------------------
		x=0;
		do{
			System.out.print("value of x : " + x );
			x++;
			System.out.print("\n");
		}while( x < 20 );
		
//		---------------------------------------------------------------------

		x=0;
		for(x=0; x<=50; x++ ) {
			if( x == 3 ) {
				break;
			}
			System.out.print( x );
			System.out.print("\n");

		}
	}
}
