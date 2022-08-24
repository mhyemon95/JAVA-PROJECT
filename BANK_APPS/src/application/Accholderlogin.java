package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Accholderlogin {
	public void viewAcc(ActionEvent e) {
		Main.ft.Fxmlcall("EmployeeAccInfo.fxml");
		}
public void back(ActionEvent event) {
	Main.ft.Fxmlcall("login.fxml");
}
public void displayAll(ActionEvent event) {
	Main.ft.Fxmlcall("AccountInfo.fxml");
}
public void currentMoney(ActionEvent event) {
	Main.ft.Fxmlcall("Current Money.fxml");
}
public void transaction(ActionEvent event) {
	Main.ft.Fxmlcall("AccountHolderTransation.fxml");
}
}
