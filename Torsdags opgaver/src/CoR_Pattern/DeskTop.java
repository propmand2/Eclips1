package CoR_Pattern;

import javafx.scene.input.MouseEvent;

public class DeskTop {

	
	public boolean handleRequest() {
		//kan h�ndtere request
		  if (MouseEvent.MOUSE_CLICKED != null  ) {
		   // h�ndter request
			  
			System.out.println("Du har trykket");
			  
		    return true;
		  } else
		    return false;
		}
}

