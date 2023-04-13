package com.internsala.javaFxApp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public  class MyMain extends Application {
	public static void main(String[]args)
	{
        launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {


		FXMLLoader loader = new FXMLLoader(getClass().getResource("app_layout.fxml"));
		      VBox rootNode = loader.load();




		Scene scene = new Scene(rootNode);
		primaryStage.setScene(scene);
		primaryStage.setTitle("New Warmup App");
		primaryStage.show();
	}


}
