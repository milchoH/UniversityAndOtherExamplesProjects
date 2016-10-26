import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainClass extends Application {

	Stage window;
	Scene scene;
	Button button;
	ComboBox<String> comboBox;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Lesson 14 - Combo Box");
		
		button = new Button("click me");
		
		comboBox = new ComboBox<>();
		comboBox.getItems().addAll(
				"test1",
				"test2",
				"test3"
		);
		
		comboBox.setPromptText("what test is this");
		comboBox.setEditable(true);
		comboBox.setOnAction(e->System.out.println(comboBox.getValue() + " is selected"));
		button.setOnAction(e->{
			printMovie();
		});
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10,10,10,10));
		layout.getChildren().addAll(comboBox,button);
		
		scene = new Scene(layout,300,200);
		window.setScene(scene);		
		window.show();		
	}
	private void printMovie(){
		System.out.println(comboBox.getValue());
	}

}
