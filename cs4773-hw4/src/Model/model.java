package Model;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import ViewModel.viewmodel;
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
	public ListView myListView;
	@FXML
	private TextField myName;
	@FXML
	private TextField myScore;
	@FXML
	private TextField myDate;
	@FXML
	private Button mySave;
	
	public ObservableList<viewmodel> vm = FXCollections.observableArrayList(
			new viewmodel("Default 0"),
			new viewmodel("Default 0"),
			new viewmodel("Default 0"),
			new viewmodel("Default 0"),
			new viewmodel("Default 0"));
	public String selectedTeam;
	public int index;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		myListView.setItems(vm);
			
		myListView.setOnMouseClicked(event -> {
			selectedTeam = myListView.getSelectionModel().getSelectedItem().toString();
			index = myListView.getSelectionModel().getSelectedIndex();
			view newview = new view();
			try {
				newview.openGUI(selectedTeam, index);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}

		
}
