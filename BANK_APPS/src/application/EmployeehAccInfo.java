package application;

import banking.BankAccount;
import banking.InvalidAccountException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EmployeehAccInfo {

	@FXML
	Label nameLabel;
	@FXML
	TextField accNumTf;
	
	public void shoAccInfo(ActionEvent event) {
		String accNum=accNumTf.getText();
		try {
			BankAccount display=Main.bank.findAccount(accNum);
			nameLabel.setText(display.toString());
		} catch (InvalidAccountException e) {
			nameLabel.setText(e.getMessage());
		}
	}
	public void goAccEmployeeHome(ActionEvent event) {
		Main.ft.Fxmlcall("HomeScreen.fxml");
		}
	
}
