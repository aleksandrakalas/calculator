package probjectOne;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CalculatorEventHandler implements EventHandler<ActionEvent>{
	
	private String num1 = "";
	private String num2 = "";
	private String sign = "";
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
		if (num1 == "") {
			if ((t == "+")||(t == "-")||(t == "/")||(t == "x")||(t == "=")) {
				this.t.setText("You must enter a number first");
			}
			else if (t != "CLEAR") {
				num1 = t;
				setText();
			}
		}
		else if (num1 != "") {
			if ((sign == "")&&((t != "+")&&(t != "-")&&(t != "/")&&(t != "x")&&(t != "="))) {
				// 1 & 0
				num1 += t;
				setText();
			}
			else if (sign != "") {
				// 1 + ....
				if (num2 == "") {
					num2 = t;
					setText();
				}
				else if ((num2 != "")&&(t != "=")) {
					num2 += t;
					setText();
				}
			}
			else {
				sign = t;
				setText();
			}
		}
		else if (t == "CLEAR") {
			clearButton();
		}
		else if ((t == "=")&&(num1 != "")&&(num2 != "")&&(sign != "")) {
			String result = calculate(num1, num2, sign);
			this.tf.setText(result);
		}
	}

	private String calculate(String num1, String num2, String sign) {
		// TODO Auto-generated method stu
		int result;
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		
		if (sign == "+") {
			result = number1 + number2;
			return String.valueOf(result);
		}
		else if (sign == "-") {
			result = number1 - number2;
			return String.valueOf(result);
		}
		else if (sign == "/") {
			result = number1 / number2;
			return String.valueOf(result);
		}
		else if (sign == "x") {
			result = number1 * number2;
			return String.valueOf(result);
		}
		else {
			return "Can not calculate";
		}
		
	}

	private void setText() {
		tf.setText(num1 + sign + num2);
		
	}

	private void clearButton() {
		/*
		 * Clear the items, such as the numbers being used 
		 * currently, on the screen 
		 */
		this.num1 = "";
		this.num2 = "";
		this.sign = "";
		this.t.setText("");
		this.tf.setText("");
	}

}
