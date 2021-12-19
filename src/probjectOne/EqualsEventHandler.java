package probjectOne;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class EqualsEventHandler implements EventHandler<ActionEvent>{
	
	private String num1 = null;
	private String num2 = null;
	private String sign = null;
	
	@Override
	public void handle(ActionEvent event) {
		/*
		 * Event handler for equals sign button.
		 */
		Button source=(Button)event.getSource();
		String t = source.getText();
		if (num1 == null) {
			if ((t == "+")||(t == "-")||(t == "/")||(t == "x")) {
				
			}
				
		}
		else if (num1 != null) {
			
		}
		if (source.getText().equals("0")) {
			
		}
		
	}

}
