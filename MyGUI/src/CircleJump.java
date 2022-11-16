import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleJump extends Application {

	private Circle circle;
	private Random gen = new Random();

	//--------------------------------------------------------------------
	// Presents a button that causes a displayed circle to jump to
	// a new location when it is pressed.
	//--------------------------------------------------------------------
	
	public void start(Stage primaryStage) {
		circle = new Circle(200, 200, 10);
		circle.setFill(Color.RED);

		Button button = new Button("Jump");
		button.setOnAction(this::processButtonPress);

		Group root = new Group(button, circle);

		Scene scene = new Scene(root, 400, 400);

		primaryStage.setTitle("Circle Jump");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	//--------------------------------------------------------------------
	// Updates the circle's position when the button is pushed.
	//--------------------------------------------------------------------
	public void processButtonPress(ActionEvent event) {

		circle.setCenterX(gen.nextInt(400));
		circle.setCenterY(gen.nextInt(400));
	}

	public static void main(String[] args) {

		launch(args);
	}
}