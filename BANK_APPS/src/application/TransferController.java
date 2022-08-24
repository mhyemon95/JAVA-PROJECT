package application;

import java.io.FileNotFoundException;
import java.io.IOException;

import banking.InSufficientBalanceException;
import banking.InvalidAccountException;
import banking.MaxWithdawException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TransferController {
	@FXML
	TextField sendertf, receivertf, amttf;
	@FXML
	Label x;
	public void transfer() throws MaxWithdawException {
		String sender = sendertf.getText();
		String receiver = receivertf.getText();
		double amt= Double.parseDouble(amttf.getText());
		try {
			x.setText(Double.toString(Main.bank.getBalance(receiver)));
			} catch (InvalidAccountException e) {
			
			}
		try {
			Main.bank.transfer(sender, receiver, amt);
		} catch (InvalidAccountException e) {
			x.setText(e.getMessage());
		} catch (InSufficientBalanceException e) {
			x.setText(e.getMessage());
		} try {
			x.setText(Double.toString(Main.bank.getBalance(sender)));
		} catch (InvalidAccountException e) {
			x.setText(e.getMessage());
		}
		try {
			Main.bank.saveData();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		x.setText("Transfer Successfull.");
		try {
			Main.bank.saveData();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

public void home(ActionEvent event) {
	Main.ft.Fxmlcall("HomeScreen.fxml");
}
}