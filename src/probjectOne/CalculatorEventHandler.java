package probjectOne;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CalculatorEventHandler implements EventHandler<ActionEvent>{
	
	private String num1 = null;
	private String num2 = null;
	private String sign = null;
	private TextField tf;
	private Text t;
	
	public CalculatorEventHandler(TextField tf, Text t) {
		this.tf = tf;
		this.t = t;
	}
	
	@Override
	public void handle(ActionEvent event) {
		/*
		 * Event handler for equals sign button.
		 */
		Button source=(Button)event.getSource();
		String t = source.getText();
		if (num1 == null) {
			if ((t == "+")||(t == "-")||(t == "/")||(t == "x")) {
				this.t.setText("You must enter a number first");
			}
			else if (t != "CLEAR") {
				num1 = t;
			}
		}
		else if (num1 != null) {
			if (sign == null) {
				// 1 & 0
				num1 += t;
			}
			else if (sign != null) {
				// 1 + ....
				if (num2 == null) {
					num2 = t;
				}
				else if (num2 != null) {
					num2 += t;
				}
			}
		}
		if (t == "CLEAR") {
			clearButton();
		}
	}
	
	private void clearButton() {
		/*
		 * Clear the items, such as the numbers being used 
		 * currently, on the screen 
		 */
		this.num1 = null;
		this.num1 = null;
		this.sign = null;
		this.t.setText("");
		this.tf.setText("");
	}

}
