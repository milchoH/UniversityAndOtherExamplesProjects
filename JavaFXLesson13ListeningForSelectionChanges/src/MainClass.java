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
		window.setTitle("Lesson 13 Listenin For Selection Changes");
		
		button = new Button("click me");
		
		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		choiceBox.getItems().addAll("listening", "for", "selection", "Changes");
		choiceBox.setValue("listening");
		
		choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> System.out.println(newValue));
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10,10,10,10));
		layout.getChildren().addAll(choiceBox,button);
		
		scene = new Scene(layout,300,300);
		window.setScene(scene);
		window.show();
		
	}

}
