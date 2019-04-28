package ekstra;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Mediator {
	private Label wordLbl = new Label("Ord:");
	private Label amountLbl = new Label("Antal:");
	private Label warningLbl = new Label("");
	private TextField wordInputTxf = new TextField();
	private TextField amountInputTxf = new TextField();
	private TextArea pasteTA = new TextArea();
	private Button printBtn = new Button("Print");
	private HBox HBox = new HBox();
	private BorderPane mainPane = new BorderPane();
	private Scene mainScene = new Scene(mainPane);

	public void start(Stage stage) {
		// Setup for stage
		Stage mainStage = new Stage();
		mainStage.setTitle("CopyPaste");
		mainStage.setWidth(470);
		mainStage.setHeight(500);
		mainStage.setScene(mainScene);

		// TextField settings
		amountInputTxf.setMaxWidth(40);

		// Add widgets to top bar (HBox)
		HBox.getChildren().addAll(wordLbl, wordInputTxf, amountLbl, amountInputTxf, printBtn, warningLbl);
		HBox.setPadding(new Insets(10, 10, 10, 10));
		HBox.setSpacing(8);

		// Button setting
		printBtn.setDisable(true);
		printBtn.setOnAction(e -> copyPaste());

		// TextArea setting
		pasteTA.setEditable(false);

		// Add listener/observers to TextFields
		wordInputTxf.textProperty().addListener((observable, oldValue, newValue) -> {
			checkEmptyTxf();
		});
		amountInputTxf.textProperty().addListener((observable, oldValue, newValue) -> {
			checkEmptyTxf();
			validateAmount();
		});

		// Add items to pane
		mainPane.setCenter(pasteTA);
		mainPane.setTop(HBox);

		//
		mainStage.show();
	}

	private void checkEmptyTxf() {
		if (wordInputTxf.getText().isEmpty() || amountInputTxf.getText().isEmpty()) {
			printBtn.setDisable(true);
		} else {
			printBtn.setDisable(false);
		}
	}

	private void validateAmount() {
		if (!amountInputTxf.getText().matches("[0-9]+") && !amountInputTxf.getText().isEmpty()) {
			warningLbl.setText("Kun positive hele tal");
			warningLbl.setTextFill(Color.rgb(255, 0, 0));
			amountLbl.setTextFill(Color.rgb(255, 0, 0));
			printBtn.setDisable(true);
		} else {
			warningLbl.setText("");
			amountLbl.setTextFill(Color.rgb(0, 0, 0));
		}
	}

//	private void validateAmountTxf() {
//		if (amountInputTxf.getText().matches("[0-9]+")) {
//			printBtn.setDisable(false);
//		} else {
//			printBtn.setDisable(true);
//		}
//	}

	private void copyPaste() {
		String copyStr = wordInputTxf.getText();
		int amountInt = Integer.parseInt(amountInputTxf.getText());

		wordInputTxf.clear();
		pasteTA.setText("");
		for (int i = 0; i < amountInt; i++) {
			pasteTA.appendText(copyStr + "\n");
		}
	}
}
