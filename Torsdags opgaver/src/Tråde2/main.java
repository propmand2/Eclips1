package Tr�de2;

public class main {

	public static void main(String[] args) {

		 CascadeThread efterf�lger = null;
		 
		 for ( int i=0; i<10; i++ ) {
		      efterf�lger = new CascadeThread( "Tr�d " + i,  efterf�lger);
		      efterf�lger.start();
		    }
		    
		    efterf�lger.setN�ste();
		  }
		}


	


