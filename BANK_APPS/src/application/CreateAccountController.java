package application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CreateAccountController implements Initializable {
	@FXML
	TextField nameTf,nidTf,balanceTf,tradeLicensetf,instNameTf;
	@FXML
	Label stId,trade,insName,maxWith,info;
	@FXML
	ComboBox<String> comb;
	String accountType;
	public void combAction(ActionEvent event) {
		String choice=comb.getSelectionModel().getSelectedItem().toString();
		if(choice.equalsIgnoreCase("Saving Account"))
		{
			accountType="Saving Account";
			maxWith.setVisible(true);
			stId.setVisible(false);
			trade.setVisible(false);
			insName.setVisible(false);
			instNameTf.setVisible(false);
		}
		else if(choice.equalsIgnoreCase("Current Account"))
		{
			accountType="Current Account";
			maxWith.setVisible(false);
			stId.setVisible(false);
			trade.setVisible(true);
			insName.setVisible(false);
			instNameTf.setVisible(false);
		}
		else if(choice.equalsIgnoreCase("Student Account"))
		{
			accountType="Student Account";
			maxWith.setVisible(false);
			stId.setVisible(true);
			trade.setVisible(false);
			insName.setVisible(true);
			instNameTf.setVisible(true);
		}
	}
	public void save(ActionEvent event) {
		String name=nameTf.getText();
		String nid=nidTf.getText();
		double balance=Double.parseDouble(balanceTf.getText());
		if(accountType.equalsIgnoreCase("Saving Account"))
		{
			double maxWith=Double.parseDouble(tradeLicensetf.getText());
			String accNum=Main.bank.addAccount(name, nid, balance, maxWith);
			info.setText(accNum);
			try {
				Main.bank.saveData();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if(accountType.equalsIgnoreCase("Student Account"))
		{
			String stdId=tradeLicensetf.getText();
			String instiName=instNameTf.getText();
			String accNum=Main.bank.addAccount(name, nid, balance, instiName, stdId);
			info.setText(accNum);
			try {
				Main.bank.saveData();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if(accountType.equalsIgnoreCase("Current Account"))
		{
			String tradeLicense=tradeLicensetf.getText();
			String accNum=Main.bank.addAccount(name, nid, balance, tradeLicense);
			info.setText(accNum);
			try {
				Main.bank.saveData();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			ObservableList<String> list=FXCollections.observableArrayList("Saving Account","Student Account","Current Account");
			comb.setItems(list);
			stId.setVisible(false);
			trade.setVisible(false);
			insName.setVisible(false);
			instNameTf.setVisible(false);
	}
	public void home(ActionEvent event) {
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("HomeScreen.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primarystage.setScene(scene);
			Main.primarystage.show();
			
		}
			catch(Exception we) {
				we.getMessage();
			}
	}
	public void exit(ActionEvent event) {
		System.exit(0);
	}
	
}
