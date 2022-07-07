package main;
	

import gui.WelkomSchermController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;



public class StartUp extends Application {
	@Override
	public void start(Stage primaryStage) {
		WelkomSchermController root = new WelkomSchermController();
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Welkom bij JavaFX");
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
