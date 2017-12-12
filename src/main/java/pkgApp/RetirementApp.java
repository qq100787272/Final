package pkgApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pkgApp.controller.RetirementController;

import java.io.IOException;

public class RetirementApp extends Application {

	private RetirementApp controller;
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			
			loader =  new FXMLLoader(getClass().getResource("/app/view/Retirement.fxml"));
			 
			BorderPane ClientServerOverview = (BorderPane) loader.load();

			Scene scene = new Scene(ClientServerOverview);

			primaryStage.setScene(scene);

			// Give the controller access to the main app.
			RetirementController controller = loader.getController();
			controller.setMainApp(this);
			
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
