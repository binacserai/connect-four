package com.internsala.javaFxApp;


import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
	@FXML
	public Pane myPane ;
	@FXML
	public Button myButton;


	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		Circle circle = new Circle();
		circle.setRadius(20);
		circle.setFill(Color.RED);
		circle.setTranslateX(50);
		circle.setTranslateY(50);

		myPane.getChildren().addAll(circle);
		myButton.setOnAction(event->
		{
			startAnimation(circle);
		});

	}

	private void startAnimation(Circle circle) {
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.seconds(1));
		transition.setNode(circle);
		transition.setToY(300);
		transition.play();
	}


}

