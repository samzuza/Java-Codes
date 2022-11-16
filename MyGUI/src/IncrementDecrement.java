//************************************************************************
//  Write a JavaFX application that presents two buttons and a number (initially 50) 
//  to the user. Label the buttons Increment and Decrement. When the increment 
//  button is pushed, increment the displayed value. Likewise, decrement the value 
//  when the decrement button is pushed
//
//  use this in run configurations, vm argument
//  --module-path "C:\Program Files\Java\javafx-sdk-17.0.1\lib" --add-modules javafx.controls,javafx.fxml
//
//  Solution to Programming Project 4.14
//************************************************************************

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class IncrementDecrement extends Application
{
    private Text numText;
    private int num;
    
    //--------------------------------------------------------------------
    //  Presents two buttons that increment or decrement the value of a
    //  displayed number.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        num = 50;
        numText = new Text("50");

        Button incButton = new Button("Increment");
        incButton.setOnAction(this::processIncButtonPress);

        Button decButton = new Button("Decrement");
        decButton.setOnAction(this::processDecButtonPress);

        FlowPane root = new FlowPane(incButton, numText, decButton);
        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setStyle("-fx-background-color: beige");

        Scene scene = new Scene(root, 400, 100);
        
        primaryStage.setTitle("Increment Decrement");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //--------------------------------------------------------------------
    //  Increments the number and updates the text.
    //--------------------------------------------------------------------
    public void processIncButtonPress(ActionEvent event)
    {
        num++;
        numText.setText("" + num);
    }
    
    //--------------------------------------------------------------------
    //  Decrements the number and updates the text.
    //--------------------------------------------------------------------
    public void processDecButtonPress(ActionEvent event)
    {
        num--;
        numText.setText("" + num);
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}