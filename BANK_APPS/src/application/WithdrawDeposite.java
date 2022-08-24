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

public class WithdrawDeposite {
	@FXML
	TextField accNoTf;
	@FXML
	TextField balanceTf;
	@FXML
	Label lblinfo;
	@FXML
	Label y;
	public void deposite(ActionEvent dpst) {
		String accnum=accNoTf.getText();
		double accblnc=Double.parseDouble(balanceTf.getText());
		try {
			Main.bank.deposit(accnum, accblnc);
		} catch (InvalidAccountException e) {
		
			lblinfo.setText(e.getMessage());
		}
		try {
			lblinfo.setText(Double.toString(Main.bank.getBalance(accnum)));
		} catch (InvalidAccountException e) {
			lblinfo.setText(e.getMessage());
		}
		
		try {
			Main.bank.saveData();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void Withdraw(ActionEvent dpst) {
		String accnum=accNoTf.getText();
		double accblnc=Double.parseDouble(balanceTf.getText());
		try {
			lblinfo.setText(Double.toString(Main.bank.getBalance(accnum)));
			} catch (InvalidAccountException e) {
			
			}
			
		try {
			Main.bank.withdraw(accnum, accblnc);
		} catch (InvalidAccountException e) {
			lblinfo.setText(e.getMessage());
		} catch (InSufficientBalanceException e) {
			lblinfo.setText(e.getMessage());
		} catch (MaxWithdawException e) {
			lblinfo.setText(e.getMessage());
		}
		
		try {
			Main.bank.saveData();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

public void GoHome(ActionEvent event) {
	Main.ft.Fxmlcall("HomeScreen.fxml");
}
}
