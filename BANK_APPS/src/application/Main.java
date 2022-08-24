package application;
import java.io.IOException;

import banking.Bank;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static Bank bank=new Bank("Asia Bank");
	public static Stage primarystage =null;
	public static Fxml ft = new Fxml();
	@Override
	public void start(Stage Stage) {
		try {
			primarystage =Stage;
			AnchorPane root = FXMLLoader.load(getClass().getResource("login.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primarystage.setScene(scene);
			primarystage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			bank.loadData();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		launch(args);
	}
	} 
