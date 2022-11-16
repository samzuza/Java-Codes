//************************************************************************
//  Write a JavaFX application that draws 20 horizontal, evenly spaced parallel lines 
//  of random length
//
//  use this in run configurations, vm argument
//  --module-path "C:\Program Files\Java\javafx-sdk-17.0.1\lib" --add-modules javafx.controls,javafx.fxml
//
//  Solution to Programming Project 6.11
//************************************************************************

import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class ParallelLines extends Application
{
    //--------------------------------------------------------------------
    //  Displays 20 horizontal, evenly-spaced parallel lines of
    //  random length.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Random gen = new Random();
        
        Group root = new Group();
        
        int y = 30;
        
        for (int count = 1; count <= 20; count++)
        {
           y += 15;  // gap between lines
           
           // generate random length in range 100 to 400
           int length = gen.nextInt(301) + 100;

           Line line = new Line(50, y, 50 + length, y);
           line.setStroke(Color.BLUE);
           line.setStrokeWidth(3);
           
           root.getChildren().add(line);
        }

        Scene scene = new Scene(root, 500, 400, Color.WHITE);

        primaryStage.setTitle("Parallel Lines");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}