package probjectOne;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class UserInterface extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		initUI(stage);
	}

	private void initUI(Stage stage) {

		Text text = new Text();
		text.setText("Follow the given instructions to use the calculator:");
		text.setFont(Font.font ("Times New Roman", 15));
		text.setFill(Color.RED);
		Text text2 = new Text();
		text2.setText("You must enter a number first, followed by a sign, and another number");
		text2.setFont(Font.font ("Times New Roman", 15));
		text2.setFill(Color.RED);
		
		VBox root = new VBox(); // LAYOUT
		
		root.setPadding(new Insets(10));
		
		// Adding buttons:
		Button num1 = createButton("1");
		Button num2 = createButton("2");
		Button num3 = createButton("3");
		Button num4 = createButton("4");
		Button num5 = createButton("5");
		Button num6 = createButton("6");
		Button num7 = createButton("7");
		Button num8 = createButton("8");
		Button num9 = createButton("9");
		Button num0 = createButton("0");
		
		Button equalB = createButton("=");
		Button addB = createButton("+");
		Button subtractB = createButton("-");
		Button divideB = createButton("/");
		Button multiplyB = createButton("x");
		
		// Add a textfield
		TextField tf = new TextField();
		//TextField tf2 = new TextField();
		tf.setDisable(true);
		
		
		GridPane gp = new GridPane(); // Aligns horizontally
		gp.addRow(0, addB, subtractB, divideB, multiplyB, equalB);
		gp.addRow(1, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9);
		gp.addRow(2, tf);
		// Adding the items to the screen
		root.getChildren().addAll(text, text2, gp);
		//root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root); // SCENE
		
		stage.setTitle("Calculator");
		stage.setScene(scene);
		stage.show();
	}
	
	public Button createButton(String sign) {
		/*
		 * All buttons have the same format, method returns a
		 * button created.
		 */
		Button button = new Button();
		button.setText(sign);
		button.setFont(Font.font ("Times New Roman", 15));
		button.setTextFill(Color.DARKRED);
		return button;
	}
}
