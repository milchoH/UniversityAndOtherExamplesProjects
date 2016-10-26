import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	Stage window;

	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Lesson 8 main class title");
		
		HBox TopPanel = new HBox();
		Button FileButton = new Button("File");
		Button EditButton = new Button("Edit");
		Button ViewButton = new Button("View");
		TopPanel.getChildren().addAll(FileButton, EditButton,ViewButton);
		
		VBox LeftPanel = new VBox();
		Button DButton = new Button("D");
		Button EButton = new Button("E");
		Button FButton = new Button("F");
		LeftPanel.getChildren().addAll(DButton, EButton, FButton);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(TopPanel);
		borderPane.setLeft(LeftPanel);
		
		StackPane StackPaneLayout = new StackPane();
		Scene scene = new Scene(borderPane, 200,200);
		window.setScene(scene);
		window.show();
	}

}
