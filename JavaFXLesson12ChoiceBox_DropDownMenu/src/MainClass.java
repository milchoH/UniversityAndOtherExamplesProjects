import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	Stage window;
	Scene scene;
	Button button;
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Lesson 12 - Choice Box and Drop Down Menu");
		
		button = new Button("Click me");
		
		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		
		choiceBox.getItems().add("lets");
		choiceBox.getItems().add("test");
		choiceBox.getItems().addAll("LETS", "TEST", "ALL");
		choiceBox.setValue("lets");
		
		button.setOnAction(e->{
			getChoice(choiceBox);
		});
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets (10, 10, 10,10));
		layout.getChildren().addAll(button, choiceBox);
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}
	private void getChoice(ChoiceBox<String> choiceBox){
		String food = choiceBox.getValue();
		System.out.println(food);
		
	}

}
