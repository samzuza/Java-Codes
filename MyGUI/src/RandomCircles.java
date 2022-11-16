//************************************************************************
//  Write a JavaFX application that draws 100 circles of random color and random 
//  size in random locations. Ensure that the entire circle appears in the visible area 
//  of the scene
//
//  use this in run configurations, vm argument
//  --module-path "C:\Program Files\Java\javafx-sdk-17.0.1\lib" --add-modules javafx.controls,javafx.fxml
//
//  Solution to Programming Project 6.14
//************************************************************************

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.Random;

public class RandomCircles extends Application
{
    //--------------------------------------------------------------------
    //  Displays 100 circles of random color and size in random
    //  locations.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        int radius, x, y, red, green, blue;

        Group root = new Group();
        Random gen = new Random();
        
        for (int count = 1; count <= 100; count++)
        {
            radius = gen.nextInt(41) + 10;  // 10 to 50
            
            x = gen.nextInt(600 - radius * 2) + radius;
            y = gen.nextInt(400 - radius * 2) + radius;
            
            Circle circle = new Circle(x, y, radius);
            
            red = gen.nextInt(256);
            green = gen.nextInt(256);
            blue = gen.nextInt(256);

            circle.setStroke(Color.rgb(red, green, blue));
            circle.setStrokeWidth(3);
            circle.setFill(null);
            
            root.getChildren().add(circle);
        }
        
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setTitle("Random Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}