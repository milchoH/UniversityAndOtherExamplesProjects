import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	Stage window;
	Button button;
	Scene scene;
	ListView<String> listView;

	public static void main(String[] args) {
	launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("List View lesson");
		button = new Button("OK");
		
		listView = new ListView<>();
		listView.getItems().addAll("Samsung", "Apple", "Nokia");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		button.setOnAction(e->buttonClick());
		
		VBox layout = new VBox(20);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(listView, button);
		scene = new Scene(layout,200,200);
		window.setScene(scene);
		window.show();
	}

	private void buttonClick(){
		String message = "";
		ObservableList<String> movies;
		movies = listView.getSelectionModel().getSelectedItems();
		
		for(String m:movies){
			message += m+"\n";
		}
		System.out.println(message);
	}
}
