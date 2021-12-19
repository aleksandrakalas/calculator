package probjectOne;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;

public class UserInterface extends Application {

	public static void main(String[] args) {
		
		/**
		 * static method of Application
		 * Creates an instance of Application, 
		 * starts the GUI thread and calls
		 * Application.start(stage) where stage is the window
		 */
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		initUI(stage);
	}

	private void initUI(Stage stage) {

		Text text = new Text();
		text.setText("Enter the word you would like to translate:");
		text.setFont(Font.font ("Verdana", 20));
		text.setFill(Color.RED);
		VBox root = new VBox(); // LAYOUT
		
		root.setPadding(new Insets(10));
		
		// Add a Button:
		Button testButton = new Button();
		testButton.setText("Translate");
		
		// Adding the items to the screen
		root.getChildren().add(text);
		root.getChildren().add(testButton);
		
		
		Scene scene = new Scene(root, 500, 500); // SCENE
		
		
		
		stage.setTitle("Translator :)");
		stage.setScene(scene);
		stage.show();
	}
}
