package application;

import banking.InvalidAccountException;
import banking.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AccountHolderTransaction {
	@FXML
	TextField holderTf;
	@FXML
	TextField tfnid;
	@FXML
	ListView<String> lv;
	public void transactinHistory(ActionEvent event) {
		String accNumber=holderTf.getText();
		String nid=tfnid.getText();
		ObservableList<Transaction> list;
		try {
			Main.bank.getAccTransactions(nid, accNumber);
			
			list = FXCollections.observableArrayList(Main.bank.getAccTransactions(nid, accNumber));
			for(Transaction b: list)
				lv.getItems().add(b.toString());
		} catch (InvalidAccountException e) {
			e.printStackTrace();
}
}
	public void goHome(ActionEvent event) {
		Main.ft.Fxmlcall("accholderlogin.fxml");
		}
}