package Pseudo_datastruktur;

public class test {

	public static void main(String[] args) {
		int x=10;

		int før1=1;
		int før2=1;
		int næste=før2;

		for ( int nr=3; nr<=x; nr++ ) {
		  næste = før1 + før2;
		  før1  = før2;
		  før2  = næste;
		}

		System.out.println( "Det " + x + "'te fibonacci-tal er " + næste );

	}

}
