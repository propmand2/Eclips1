package CoR_Pattern;

import javafx.scene.input.MouseEvent;

public class DeskTop {

	
	public boolean handleRequest() {
		//kan håndtere request
		  if (MouseEvent.MOUSE_CLICKED != null  ) {
		   // håndter request
			  
			System.out.println("Du har trykket");
			  
		    return true;
		  } else
		    return false;
		}
}

