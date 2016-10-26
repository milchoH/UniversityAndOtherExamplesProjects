import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	Stage window;
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("Lesson 7 title");
		window.setOnCloseRequest(e -> {
			e.consume();
			closeProgram();
		});
		Button CloseButton = new Button("Close");
		CloseButton.setOnAction(e->closeProgram());
		
		StackPane layout = new StackPane();
		layout.getChildren().addAll(CloseButton);
		Scene scene = new Scene(layout, 200,200);
		window.setScene(scene);
		window.show();
	}

	private void closeProgram() {
	/*	System.out.println("Changes were saved");
		window.close();*/
		boolean answer = AcceptBox.display("Title", "Sure you want to close");
				if(answer){
					window.close();
				}
	}

}
