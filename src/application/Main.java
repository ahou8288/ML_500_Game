package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {

	// Stage = window itself. Scene = content
	private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage=primaryStage;
		mainWindow();
//		primaryStage.show();
	}
	
	public void mainWindow() {
		//DISPLAYS all the elements in our window.
		try {
			//Connect to the view.
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainMenu.fxml"));
			AnchorPane pane = loader.load();
			
			//Connect to controller
			MainMenuController mainMenuController = loader.getController();
			mainMenuController.setMain(this);
			
			//Create a new scene on the primary stage
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
 