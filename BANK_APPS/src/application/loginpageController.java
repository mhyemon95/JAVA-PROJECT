package application;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Scene;
	import javafx.scene.layout.AnchorPane;
	import javafx.stage.Stage;
	public class loginpageController {
		public void LoginEmpolyee(ActionEvent e) {
			try {
				//Stage primaryStage = new Stage();
				AnchorPane root = FXMLLoader.load(getClass().getResource("HomeScreen.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primarystage.setScene(scene);
				Main.primarystage.show();
				
			}
				catch(Exception we) {
					
				}
		}

		public void LoginAccountHolder(ActionEvent e) {
			try {
				//Stage primaryStage = new Stage();
				AnchorPane root = FXMLLoader.load(getClass().getResource("LogInUser.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primarystage.setScene(scene);
				Main.primarystage.show();
				
			}
				catch(Exception we) {
					
				}
		}

		public void exit(ActionEvent event) {
			System.exit(0);
		}
	}
	

