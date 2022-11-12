package application;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class view {
	private AnchorPane pane;
	public void openGUI () throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor.fxml"));
		Controller con  = loader.getController();
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Editor");
		stage.show();
	}
}
