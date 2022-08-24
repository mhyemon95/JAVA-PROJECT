package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Fxml {
	 public  void Fxmlcall(String type) {
			try {
				//Stage primaryStage = new Stage();
				AnchorPane root = FXMLLoader.load(getClass().getResource(type));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primarystage.setScene(scene);
				Main.primarystage.show();
				
			}
				catch(Exception we) {
				}
		}
}
