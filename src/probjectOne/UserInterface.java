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
		VBox root = new VBox(); // LAYOUT
		
		root.setPadding(new Insets(10));
		
		// Add a Button:
		Button equalB = new Button();
		equalB.setText("=");
		equalB.setFont(Font.font ("Times New Roman", 15));
		equalB.setTextFill(Color.DARKRED);
		
		Button addB = new Button();
		addB.setText("+");
		addB.setFont(Font.font ("Times New Roman", 15));
		addB.setTextFill(Color.DARKRED);
		
		Button subtractB = new Button();
		subtractB.setText("-");
		subtractB.setFont(Font.font ("Times New Roman", 15));
		subtractB.setTextFill(Color.DARKRED);
		
		Button divideB = new Button();
		divideB.setText("/");
		divideB.setFont(Font.font ("Times New Roman", 15));
		divideB.setTextFill(Color.DARKRED);
		
		Button multiplyB = new Button();
		multiplyB.setText("x");
		multiplyB.setFont(Font.font ("Times New Roman", 15));
		multiplyB.setTextFill(Color.DARKRED);
		
		// Add a textfield
		TextField tf = new TextField();
		
		GridPane gp = new GridPane();
		gp.addRow(0, addB, subtractB, divideB, multiplyB, equalB);
		// Adding the items to the screen
		root.getChildren().addAll(text, gp);
		//root.getChildren().add(tf);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root); // SCENE
		
		stage.setTitle("Calculator");
		stage.setScene(scene);
		stage.show();
	}
}
