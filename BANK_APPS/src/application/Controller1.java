package application;

import banking.BankAccount;
import banking.InvalidAccountException;
import banking.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller1 {
	
	@FXML
	TextField nameTextField,nidTextField;
	@FXML
	ListView<String> lv;
	public void nidView(ActionEvent event) {
		String nid=nidTextField.getText();
		ObservableList<BankAccount> list=FXCollections.observableArrayList(Main.bank.findAccounts(nid));
		for(BankAccount b: list)
			lv.getItems().add(b.toString());
}
	public void accInfo(ActionEvent event) {
		String accNumber=nameTextField.getText();
		
		try {
			BankAccount account=Main.bank.findAccount(accNumber);
			lv.getItems().add(account.toString());
		} catch (InvalidAccountException e) {

			e.getMessage();
		}
		
	}
	public void transactinHistory(ActionEvent event) {
		String accNumber=nameTextField.getText();
		String nid=nidTextField.getText();
		ObservableList<Transaction> list;
		try {
			list = FXCollections.observableArrayList(Main.bank.getAccTransactions(nid, accNumber));
			for(Transaction b: list)
				lv.getItems().add(b.toString());
		} catch (InvalidAccountException e) {
			e.printStackTrace();
		}
	}
}
