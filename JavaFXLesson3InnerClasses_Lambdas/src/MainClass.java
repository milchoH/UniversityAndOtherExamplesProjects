import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainClass extends Application {
	
	Button button;
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) throws Exception {
	primaryStage.setTitle("Primary stage");
	button = new Button();
	button.setText("Click me");
	
	/*button.setOnAction(new EventHandler<ActionEvent>(){
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			
		}
	});*/
	button.setOnAction(e -> System.out.println("testtttt"));
	
	StackPane layout = new StackPane();
	layout.getChildren().add(button);;
	
	Scene scene = new Scene(layout, 300, 200);
	primaryStage.setScene(scene);
	primaryStage.show();
	
		}
	}

