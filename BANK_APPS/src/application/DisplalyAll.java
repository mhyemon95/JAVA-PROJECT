package application;

import java.util.ArrayList;
import banking.BankAccount;
import banking.InvalidAccountException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class DisplalyAll {
	@FXML
	TextField mNidtf;
	@FXML
	ListView<String> lv;
	public void accInfo(ActionEvent event) {
		lv.getItems().clear();
		String accNumber=mNidtf.getText();
			ArrayList<BankAccount> account=Main.bank.findAccounts(accNumber);
			for(int i=0; i<account.size(); i++)
				lv.getItems().add(account.get(i).toString());
	}
	public void goHome(ActionEvent event) {
		Main.ft.Fxmlcall("accholderlogin.fxml");
		}
}


