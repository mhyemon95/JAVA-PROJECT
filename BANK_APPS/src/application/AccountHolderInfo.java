package application;


import banking.BankAccount;
import banking.InvalidAccountException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AccountHolderInfo {

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
	public void goaccHome(ActionEvent event) {
		Main.ft.Fxmlcall("accholderlogin.fxml");
		}

	public void Homepage(ActionEvent event) {
		Main.ft.Fxmlcall("accholderlogin.fxml");
		}
}

