package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import banking.BankAccount;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class EmployeeAccountinfoAll implements Initializable {
ArrayList<BankAccount> accounts;
@FXML
ListView<String> myList;
@FXML
TextArea info;
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	accounts=Main.bank.getAccounts();
	for(int i=0; i<accounts.size(); i++)
		myList.getItems().add(accounts.get(i).toString());
}
public void goHome(ActionEvent event) {
	Main.ft.Fxmlcall("HomeScreen.fxml");
}
public void specificAccounts(ActionEvent event) {
	Main.ft.Fxmlcall("SpecificType.fxml");
}
}
