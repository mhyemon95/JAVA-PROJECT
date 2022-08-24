package application;

import banking.BankAccount;
import banking.InvalidAccountException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.util.ArrayList;
public class LogInUserController {
@FXML
TextField memNidTf;
@FXML
Label setMessage;
public void LogIn(ActionEvent event) {
	String memNid=memNidTf.getText();
	ArrayList<BankAccount> account=Main.bank.findAccounts(memNid);
	for(int i=0; i<account.size(); i++)
		setMessage.setId(account.get(i).toString());
	try {
		Main.bank.findAccount(memNid);
		try {
			FXMLLoader loader=new FXMLLoader(getClass().getResource("accholderlogin.fxml"));
			AnchorPane root=loader.load();
			Scene scene = new Scene(root);
			Main.primarystage.setScene(scene);
			Main.primarystage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} catch (InvalidAccountException e) {
		setMessage.setText(e.getMessage());
	}
}
public void goHome(ActionEvent event) {
	Main.ft.Fxmlcall("login.fxml");
}
}
