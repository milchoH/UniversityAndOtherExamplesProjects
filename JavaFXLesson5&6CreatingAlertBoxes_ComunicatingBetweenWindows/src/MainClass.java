import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	Stage window;
	Button button;
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("This is test 5");
		button = new Button("Boom");
		
		button.setOnAction(e -> {
			boolean answer = AcceptBox.display("Title of window", "Are you sure");
			System.out.println(answer);
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 300);
		window.setScene(scene);
		window.show();
		
	}

}
