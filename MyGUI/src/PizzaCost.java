import java.text.NumberFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.Font;

//************************************************************************
//  Write a JavaFX application that allows the user to pick a set of pizza toppings 
//  using a set of check boxes. Assuming each topping cost 50 cents, and a plain 
//  pizza costs $10, display the cost of the pizza
//
//  use this in run configurations, vm argument
//  --module-path "C:\Program Files\Java\javafx-sdk-17.0.1\lib" --add-modules javafx.controls,javafx.fxml
//
//  Solution to Programming Project 5.16
//************************************************************************

public class PizzaCost extends Application
{
    private double cost;
    private Text costText;
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();

    //--------------------------------------------------------------------
    //  Presents a set of check boxes representing pizza toppings and
    //  displays the total cost of the pizza.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        cost = 10.0;  // cost of plain pizza
        
        CheckBox extraCheese = new CheckBox("Extra Cheese");
        extraCheese.setOnAction(this::processCheckBoxAction);
        CheckBox pepperoni = new CheckBox("Pepperoni");
        pepperoni.setOnAction(this::processCheckBoxAction);
        CheckBox sausage = new CheckBox("Sausage");
        sausage.setOnAction(this::processCheckBoxAction);
        CheckBox greenPepper = new CheckBox("Green Pepper");
        greenPepper.setOnAction(this::processCheckBoxAction);
        CheckBox onion = new CheckBox("Onion");
        onion.setOnAction(this::processCheckBoxAction);
        CheckBox anchovies = new CheckBox("Anchovies");
        anchovies.setOnAction(this::processCheckBoxAction);
        
        VBox toppings1 = new VBox(extraCheese, pepperoni, sausage);
        toppings1.setSpacing(5);
        
        VBox toppings2 = new VBox(greenPepper, onion, anchovies);
        toppings2.setSpacing(5);

        costText = new Text("Pizza Cost:  $10.00");
        costText.setFont(new Font("Helvetica", 18));
        GridPane.setHalignment(costText, HPos.CENTER);

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setVgap(30);
        root.setStyle("-fx-background-color: cornsilk");

        root.add(toppings1, 0, 0);
        root.add(toppings2, 1, 0);
        root.add(costText, 0, 1, 2, 1);
        
        Scene scene = new Scene(root, 400, 150);
        
        primaryStage.setTitle("Pizza Cost");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //--------------------------------------------------------------------
    //  Updates cost based on a topping being added or removed.
    //--------------------------------------------------------------------
    public void processCheckBoxAction(ActionEvent event)
    {
        CheckBox box = (CheckBox) event.getSource();
        
        if (box.isSelected())
            cost += 0.50;
        else
            cost -= 0.50;
            
        costText.setText("Pizza Cost:  " + fmt.format(cost));
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
