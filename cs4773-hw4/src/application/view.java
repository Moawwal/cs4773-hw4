package application;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;

import ViewModel.viewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

public class view {
	@FXML
	private TextField myName;
	@FXML
	private TextField myScore;
	@FXML
	private TextField myDate;
	@FXML
	private Button mySave;
	private int index;
	private String[] textToAdd;
	
	/*public view(int index) {
		// TODO Auto-generated constructor stub
		index = this.index;
	}*/

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
	
	/*public void handleButton(ActionEvent event) {
		//ArrayList<String> text = new ArrayList<String>();
		String newtext=myName.getText()+"	"+myScore.getText();
		//text.add(myName.getText());
		//text.add(myScore.getText());
		viewModel vm = new viewModel();
		vm.updateListView(text,index);
	}*/
	
}
