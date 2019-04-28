package presentaion;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class visning extends Application {
	
	Label response;
	TextField tf;	
	
	public static void main(String[] args) {
			launch(args);		
	}
	
	public void start(Stage Mystage) {
		
		Mystage.setTitle("tekst");
		
		
		FlowPane rootnode = new FlowPane(Orientation.VERTICAL, 10, 10);
		
		
		rootnode.setAlignment(Pos.CENTER);
		
		Scene Myscene = new Scene(rootnode, 230, 140);
		
		
		Mystage.setScene(Myscene);
		

		Label labelKey = new Label("Key:");
		
		TextField tfhej = new TextField();
		tfhej.setMaxWidth(200);
		
			
		
		Label labelValue = new Label("Value:");
		
		TextField tfHej = new TextField();
		
		
		
		Button btnGetHent = new Button("Hent");
		Button btnGetgem = new Button("Gem");
		Button btnGetslet = new Button("Slet");
		
		
		rootnode.getChildren().addAll(labelKey, tfhej, labelValue, tfHej, btnGetHent, btnGetgem, btnGetslet);
		
		
		Mystage.show();
		
	


}
}
