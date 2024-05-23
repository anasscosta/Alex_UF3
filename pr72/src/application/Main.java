package application;
	


import javax.swing.text.Element;
import javax.swing.text.html.ImageView;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaView;

import javafx.scene.image.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Label;
import java.io.FileInputStream;




public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
		BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);

   
        VBox meu_vbox = new VBox();
        meu_vbox.setStyle("-fx-background-color: gray; -fx-display: flex; -fx-flex-wrap: wrap; -fx-flex-direction: column;");
        meu_vbox.setSpacing(10);

     
        Button boto = new Button("Dades Personals");
        Button boto1 = new Button("Dades Academiques");
        Button boto2 = new Button("Altres Dades");

     
        meu_vbox.getChildren().addAll(boto, boto1, boto2);

      
        boto.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-size: 20px; -fx-padding: 10px;");
        boto1.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-size: 20px; -fx-padding: 10px;");
        boto2.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-size: 20px; -fx-padding: 10px;");

      
        Image image = new Image("tic.png");
        ImageView imageView = new ImageView(image);
       

       
        Button botonImagen = new Button();
        botonImagen.setGraphic(imageView);


        meu_vbox.getChildren().add(botonImagen);

  
        root.setLeft(meu_vbox);

        primaryStage.show();
		
			
			
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
