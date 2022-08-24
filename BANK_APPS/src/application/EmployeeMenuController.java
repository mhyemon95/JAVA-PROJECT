package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class EmployeeMenuController {
public void createAccount(ActionEvent event) {
	Main.ft.Fxmlcall("CreateAccount.fxml");
}
public void DipWith(ActionEvent event) {
	Main.ft.Fxmlcall("withdraw-deposite.fxml");
}
public void Transfer(ActionEvent event) {
	Main.ft.Fxmlcall("Transfer.fxml");
}
public void Transaction(ActionEvent event) {
	Main.ft.Fxmlcall("Transaction-History.fxml");
}
public void ViewAccInfo(ActionEvent event) {
	Main.ft.Fxmlcall("EmployeeAccInfo.fxml");
}
public void DispalyAcc(ActionEvent event) {
	Main.ft.Fxmlcall("ShowInfo.fxml");
}

public void goHome(ActionEvent event) {
Main.ft.Fxmlcall("login.fxml");
}
}
