package probjectOne;

import javafx.application.Application;
import javafx.event.ActionEvent;
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
		
		Button clearB = createButton("CLEAR");
		
		// Add textfields
		TextField tf = new TextField();
		tf.setDisable(true);
		
		Text text3 = new Text();
		text3.setText("");
		text3.setFont(Font.font ("Times New Roman", 15));
		text3.setFill(Color.RED);
		
		// Event Handlers for signs
		CalculatorEventHandler ch = new CalculatorEventHandler(tf, text3);
		equalB.addEventHandler(ActionEvent.ACTION, ch);
		addB.addEventHandler(ActionEvent.ACTION, ch);
		subtractB.addEventHandler(ActionEvent.ACTION, ch);
		divideB.addEventHandler(ActionEvent.ACTION, ch);
		multiplyB.addEventHandler(ActionEvent.ACTION, ch);
		
		// Event Handlers for numbers
		num1.addEventHandler(ActionEvent.ACTION, ch);
		num2.addEventHandler(ActionEvent.ACTION, ch);
		num3.addEventHandler(ActionEvent.ACTION, ch);
		num4.addEventHandler(ActionEvent.ACTION, ch);
		num5.addEventHandler(ActionEvent.ACTION, ch);
		num6.addEventHandler(ActionEvent.ACTION, ch);
		num7.addEventHandler(ActionEvent.ACTION, ch);
		num8.addEventHandler(ActionEvent.ACTION, ch);
		num9.addEventHandler(ActionEvent.ACTION, ch);
		num0.addEventHandler(ActionEvent.ACTION, ch);
		
		clearB.addEventHandler(ActionEvent.ACTION, ch);
		
		GridPane gp = new GridPane(); // Aligns horizontally
		gp.addRow(1, addB, subtractB, divideB, multiplyB, equalB);
		gp.addRow(2, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9);
		// Adding the items to the screen
		root.getChildren().addAll(text, text2, tf, gp, clearB, text3);
		
		Scene scene = new Scene(root); // SCENE
		
		stage.setTitle("Calculator");
		stage.setScene(scene);
		stage.show();
		
		// MAKE EVENT HANDLERS FOR EVERY BUTTON
		
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
