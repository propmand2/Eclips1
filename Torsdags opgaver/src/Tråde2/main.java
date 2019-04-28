package Tråde2;

public class main {

	public static void main(String[] args) {

		 CascadeThread efterfølger = null;
		 
		 for ( int i=0; i<10; i++ ) {
		      efterfølger = new CascadeThread( "Tråd " + i,  efterfølger);
		      efterfølger.start();
		    }
		    
		    efterfølger.setNæste();
		  }
		}


	


