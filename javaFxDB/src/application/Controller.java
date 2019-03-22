package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	@FXML
	private TextField txt1;
	
	@FXML
	private TextField txt2;
		
	@FXML
	private Button input;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		input.setOnAction(e -> insert(e));
			}
	
	public void insert(ActionEvent event) {
		UserDto dto=new UserDto(1, txt1.getText(), txt2.getText());
		Dao.insert(dto);
	}
}
