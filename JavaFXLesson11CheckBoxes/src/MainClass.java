import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	Stage window;
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		window.setTitle("Checkboxes lesson");
		
		CheckBox box1 = new CheckBox("Check box 1");
		CheckBox box2 = new CheckBox("Check box 2");
		
		Button button = new Button("Click me");
		button.setOnAction(e->{
			handleOptions(box1, box2);
		});
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(box1, box2, button);
		Scene scene = new Scene(layout, 200, 200);
		window.setScene(scene);
		window.show();
	}
	private void handleOptions(CheckBox box1,CheckBox box2){
		String message = "selected boxes are\n";
		if (box1.isSelected()){
			message += "Check box 1\n";	
		}
		if(box2.isSelected()){
			message += "Check Box 2\n";
		}
		System.out.println(message);
	}

}
