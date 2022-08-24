package application;

import banking.BankAccount;
import banking.InvalidAccountException;
import banking.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TransactionController {
@FXML
TextField accountNumTf;
@FXML
Label nameLabel;
//@FXML
//TextField nidTf;
@FXML
ListView<String> lv;
public void transactionHistroy() {
	String accountNum=accountNumTf.getText();
	//String nid=nidTf.getText();
	ObservableList<Transaction> list;
	try {
		list = FXCollections.observableArrayList(Main.bank.getAccTransactions( accountNum));
		for(Transaction t: list)
			lv.getItems().add(t.toString());
	} catch (InvalidAccountException e) {
		//e.printStackTrace();
		nameLabel.setText(e.getMessage());
	}
}

public void goHome(ActionEvent event) {
Main.ft.Fxmlcall("HomeScreen.fxml");
}
}
