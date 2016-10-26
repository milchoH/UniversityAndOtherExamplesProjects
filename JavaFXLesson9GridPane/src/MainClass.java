import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainClass extends Application {

	Stage window;
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Grid Pane lesson");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		Label nameLabel = new Label("Username");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		TextField nameTF = new TextField("Username");
		GridPane.setConstraints(nameTF, 1, 0);
		
		Label passLabel = new Label("Password");
		GridPane.setConstraints(passLabel, 0, 1);
		
		PasswordField passTF = new PasswordField();
		passTF.setPromptText("password");
		GridPane.setConstraints(passTF, 1, 1);
		
		Button LoginButton = new Button("Login");
		GridPane.setConstraints(LoginButton, 1, 2);
		
		grid.getChildren().addAll(nameLabel, nameTF, passLabel, passTF,LoginButton);
		
		Scene scene = new Scene(grid, 250,110);
		window.setScene(scene);
		window.show();
	}

}
