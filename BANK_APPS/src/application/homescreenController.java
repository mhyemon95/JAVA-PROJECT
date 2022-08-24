package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class homescreenController {
	public void CreateAccount(ActionEvent e) {
Main.ft.Fxmlcall("CreateAccount.fxml");
	
	}
	public void accountHolder(ActionEvent e) {
		Main.ft.Fxmlcall("AccHolder.fxml");
	}
}
