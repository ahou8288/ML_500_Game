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
	
	Scene menuScene;
	Scene singleGameScene;
	
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
			FXMLLoader menuLoader = new FXMLLoader(Main.class.getResource("MainMenu.fxml"));
			AnchorPane menuPane = menuLoader.load();
			
			FXMLLoader singleLoader = new FXMLLoader(Main.class.getResource("SingleGame.fxml"));
			AnchorPane singlePane = singleLoader.load();
			
			//Connect to controller
			MainMenuController mainMenuController = menuLoader.getController();
			mainMenuController.setMain(this);

			SingleGameController singleGameController = singleLoader.getController();
			singleGameController.setMain(this);
			
			//Create a new scene on the primary stage
			menuScene = new Scene(menuPane);
			singleGameScene = new Scene(singlePane);
			
			primaryStage.setScene(menuScene);
			primaryStage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public void SwitchTo(String newViewTitle) {
		// TODO Auto-generated method stub
		switch (newViewTitle){
		case "SingleGame":
			primaryStage.setScene(singleGameScene);
			System.out.println("switching view to single game");
		}
		
	}
}
 