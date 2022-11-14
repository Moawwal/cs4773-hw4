package application;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

import Model.model;
import ViewModel.viewmodel;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class view implements Initializable{
	@FXML
	private TextField myName;
	@FXML
	private TextField myScore;
	@FXML
	private TextField myDate;
	@FXML
	private Button mySave;
	
	public void openGUI (String selectedTeam, int index) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor.fxml"));
		//Controller con  = loader.getController();
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Editor");
		stage.show();
		
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		mySave.setOnAction( event -> {
			String textToAdd;
			textToAdd=myName.getText()+"	"+myScore.getText();
			model mo = new model();
			mo.vm.remove(mo.index);
			mo.vm.add(mo.index,new viewmodel(textToAdd));
			System.out.println("team added through init");
			System.out.println(mo.vm);
		});
			
	}
}
