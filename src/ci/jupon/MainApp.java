package ci.jupon;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainApp extends Application{
	
	Font font = Font.font("Metropolis", 16);
	HBox hz = new HBox(5);
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("The Womanizer Best Friend");
		Parent root = FXMLLoader.load(getClass().getResource("/resources/fxml/Main.fxml"));

		
	
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/resources/css/App.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
