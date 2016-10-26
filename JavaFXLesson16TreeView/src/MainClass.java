import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	Stage window;
	Scene scene;
	TreeView<String> tree;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Lesson 16 - Tree View");
		
		TreeItem<String> root, haha, xaxa;
		
		root = new TreeItem<>();
		root.setExpanded(true);
		
		haha = makeBranch("HAHA", root);
		makeBranch("tova",haha);
		makeBranch("sa",haha);
		makeBranch("haha",haha);
		
		xaxa = makeBranch("XAXA",root);
		makeBranch("tova",xaxa);
		makeBranch("sa",xaxa);
		makeBranch("xaxa",xaxa);
		
		tree = new TreeView<>(root);
		tree.setShowRoot(false);
		tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue,newValue)->{
			if(newValue != null){
				System.out.println(newValue.getValue());				
			}
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(tree);
		scene = new Scene(layout,200,200);
		window.setScene(scene);
		window.show();
	}
	
	public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
		TreeItem<String> item = new TreeItem<>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}

}
