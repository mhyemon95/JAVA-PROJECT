package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class dipwith {
	public void dipositwithdrow(ActionEvent e) {
		try {
			//Stage primaryStage = new Stage();
			AnchorPane root = FXMLLoader.load(getClass().getResource("homescreen.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primarystage.setScene(scene);
			Main.primarystage.show();
			
		}
			catch(Exception we) {
				
			}
	}
}
