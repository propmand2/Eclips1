package Pseudo_datastruktur;

public class test {

	public static void main(String[] args) {
		int x=10;

		int f�r1=1;
		int f�r2=1;
		int n�ste=f�r2;

		for ( int nr=3; nr<=x; nr++ ) {
		  n�ste = f�r1 + f�r2;
		  f�r1  = f�r2;
		  f�r2  = n�ste;
		}

		System.out.println( "Det " + x + "'te fibonacci-tal er " + n�ste );

	}

}
