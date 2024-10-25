package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public JFXButton btnReception;
    public JFXButton btnAdmin;
    public AnchorPane mainContext;

    public void btnReceptionOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)mainContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionForm.fxml"))));

    }

    public void btnAdminOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)mainContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"))));

    }
}
