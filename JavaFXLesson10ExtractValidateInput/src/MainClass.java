import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	Stage window;

	public static void main(String[] args){
		launch(args);
	}
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Extract and Validate lesson");
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		
		TextField nameInput = new TextField();
		Button button = new Button("Click me");
		button.setOnAction(e->{
			isInt(nameInput, nameInput.getText());
		});
		
		layout.getChildren().addAll(nameInput,button);
		
		Scene scene = new Scene(layout, 200, 200);
		window.setScene(scene);
		window.show();
		
	}
	
	private boolean isInt(TextField input, String message){
		try{
			int age = Integer.parseInt(input.getText());
			System.out.println("The user is "+ age);
			return true;
		}catch(NumberFormatException e){
			System.out.println("Error " +"'" + message +"'" + " is not a number");
			return false;
		}
		
	}

}
