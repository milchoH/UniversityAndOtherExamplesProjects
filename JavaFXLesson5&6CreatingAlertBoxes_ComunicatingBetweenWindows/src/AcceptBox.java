import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.geometry.*;

public class AcceptBox{
	
	static boolean answer;
	
	public static boolean display(String title, String message){
		
		Stage window = new Stage();		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText(message);
		
		Button AcceptButton = new Button("Accept");
		Button DeclineButton = new Button("Decline");
		
		AcceptButton.setOnAction(e->{
			answer = true;
			window.close();
		});
		DeclineButton.setOnAction(e->{
			answer = false;
			window.close();
		});
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, AcceptButton, DeclineButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		return answer;
	}
}
