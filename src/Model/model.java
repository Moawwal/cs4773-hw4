package Model;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import application.view;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class model implements Initializable{
	@FXML
	private ListView<String> myListView;
	@FXML
	private TextField myName;
	@FXML
	private TextField myScore;
	@FXML
	private TextField myDate;
	@FXML
	private Button mySave;
	
	private String[] defaultContent = {"No name provided 0","No name provided 0","No name provided 0", 
			"No name provided 0","No name provided 0"};
	private ObservableList<String> content = FXCollections.observableArrayList(defaultContent);
	String currentString;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		myListView.setItems(content);
			
		myListView.setOnMouseClicked(event -> {
			int index = myListView.getSelectionModel().getSelectedIndex();
			view newview = new view();
			try {
				newview.openGUI();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}
	
	
	
}
