package application;

import banking.InvalidAccountException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CurrentMoneyController {
@FXML
TextField accNumberTf;
@FXML
Label showMessage;
public void seeMoney(ActionEvent event) {
	String accNum=accNumberTf.getText();
	try {
		showMessage.setText(Double.toString(Main.bank.getBalance(accNum)));
	} catch (InvalidAccountException e) {
		e.printStackTrace();
	}
}

public void goHome(ActionEvent event) {
	Main.ft.Fxmlcall("accholderlogin.fxml");
	}
}

